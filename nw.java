import java.util.*;

public class nw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you desired numbers");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.println(i + "x");
        }
        System.out.println("\nThe factorial of this number is " + fact);
    }
}