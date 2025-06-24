package easy_800;

import java.util.Scanner;


public class Adjacent_Digit_Sums {
    public static void main(String[]a) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int x = s.nextInt(), y = s.nextInt();
            long d = (long) x - y + 1;
            System.out.println(d >= 0 && d % 9 == 0 ? "Yes" : "No");
        }
    }
}
