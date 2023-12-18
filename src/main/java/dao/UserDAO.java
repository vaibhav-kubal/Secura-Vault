package dao;

import db.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO { //DATA ACCESS OBJECT
    public static boolean isExists(String email) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String query = "select email from users";
        PreparedStatement pstm = connection.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            String mail = rs.getString(1);
            if(mail.equals(email))
                return true;
        }
        return false;
    }
    public static int saveUser(User user) throws SQLException {
        Connection connection = MyConnection.getConnection();
        String query ="insert into users values (default,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        return ps.executeUpdate();
    }
}
