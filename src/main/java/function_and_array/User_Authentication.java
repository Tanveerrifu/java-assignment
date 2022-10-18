package function_and_array;

import java.util.Scanner;

public class User_Authentication {
    public static void main(String[] args) {
        String myUsername;
        String myPassword;

        myUsername = "tanvir";
        myPassword = "1234";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter Username : ");
            String username = input.nextLine();

            System.out.println("Enter Password : ");
            String password = input.nextLine();

            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("Access Granted! Welcome!");
            } else if (username.equals(myUsername)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(myPassword)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }
        System.out.println("Your are temporary locked");
        input.close();
    }
}
