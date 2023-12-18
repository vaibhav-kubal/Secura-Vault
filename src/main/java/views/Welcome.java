package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {

    public void welcomeScreen(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO THE APPLICATION");
        System.out.println("1 to login");
        System.out.println("2 to signup");
        System.out.println("0 to exit");
        int choice = 0;

        try {
            choice = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (choice){
            case 1 -> login();
            case 2 -> signup();
            case 0 -> System.exit(0);
        }
    }

    private void login() {

    }

    private void signup() {
    }
}
