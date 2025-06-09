package questions.week4;

import java.util.Scanner;

public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long y = sc.nextLong();
            long x = sc.nextLong();
            long z = Math.max(x, y);
            long ans;

            if (z % 2 == 0) {
                if (y == z) ans = z * z - x + 1;
                else ans = (z - 1) * (z - 1) + y;
            } else {
                if (x == z) ans = z * z - y + 1;
                else ans = (z - 1) * (z - 1) + x;
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}