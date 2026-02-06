import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            if (k % 2 == 1) {
                // k is odd → print n k times
                for (int i = 0; i < k; i++) {
                    sb.append(n).append(' ');
                }
            } else {
                // k is even → print n (k-1) times + 0
                for (int i = 0; i < k - 1; i++) {
                    sb.append(n).append(' ');
                }
                sb.append(0).append(' ');
            }

            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
