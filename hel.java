import java.util.*;

public class hel {
    public static void main(String[] args) {
        System.out.println("Hello from hel.java!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number you wanna sum up to");

        int sum = 0, n;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("the sum is " + sum);
    }

}
