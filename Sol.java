import java.util.*;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String username = sc.nextLine();
        System.out.println("Enter the password : ");
        String password = sc.nextLine();
        if ((username.equals("Prashanthcoder")) && (password.equals("Prashi@9098"))) {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(500); // Wait 1 second
                    System.out.print(".");
                }
            } catch (InterruptedException e) {
                System.out.println("Error during delay.");
            }
            System.out.println("LOGGED IN\n");
            try {
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(500);
                    System.out.println("_________________WELCOME TO THE PRASHANTH TECH LTD___________________________");
                }
            } catch (InterruptedException e) {
                System.out.println("Error during delay.");
            }

        } else {
            System.out.println("Lo eno lo tu🥹🥹");
        }
    }
}
