import java.util.*;

public class Truth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linenumber = 1;
        while (sc.hasNext()) {
            String linecontent = sc.nextLine();
            System.out.println(linenumber + " " + linecontent);
            linenumber++;
        }
        sc.close();
    }

}