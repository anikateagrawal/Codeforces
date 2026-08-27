package easy_900;

import java.util.Scanner;

public class Cake_Leveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long minAvg = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                long val = sc.nextLong();
                sum += val;
                long avg = sum / i;
                minAvg = Math.min(minAvg, avg);
                sb.append(minAvg).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}