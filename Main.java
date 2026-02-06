import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            if (k == 1) {
                out.append(n).append('\n');
                continue;
            }

            // Print (k-1) times n
            for (int i = 0; i < k - 1; i++) {
                out.append(n).append(' ');
            }

            // Last element is 0 to fix XOR
            out.append(0).append('\n');
        }

        System.out.print(out.toString());
    }
}
