package SMTP;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.printf("\nEnter new login: ");
        String login = in.nextLine();

        System.out.printf("\nEnter new password: ");
        String password = in.nextLine();

        System.out.printf("\nEnter your email: ");
        String email = in.nextLine();

        String code = String.valueOf(r.nextInt(999999));
        SSLEmail.send(email,"Auth code",code);

        System.out.printf("\nEnter code from email: ");
        String authcode = in.nextLine();

        if (authcode.equals(code)){
            System.out.printf("\nSuccess account: %s\t%s",login,password);
        }
        else{
            System.out.println("Wrong code");
        }
    }
}
