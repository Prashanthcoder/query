import java.util.*;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String username = sc.nextLine();
        System.out.println("Enter the password : ");
        String password = sc.nextLine();
        if ((username == "Prashanthcoder") && (password == "Prashi@9098")) {
            System.out.println("LOGGED IN\n");
            for (int i = 0; i < 20; i++) {
                System.out.println("_________________WELCOME TO THE PRASHANTH TECH LTD___________________________");
            }
        } else {
            System.out.println("Lo eno lo tu🥹🥹");
        }
    }
}
