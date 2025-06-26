package easy_800;

import java.util.*;

public class MakeArraysEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int countA1 = 0, countB1 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) countA1++;
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 1) countB1++;
            }

            // Count mismatches after any rearrangement
            int mismatches = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) mismatches++;
            }

            // Either fix via direct flips, or flip to match 1's count and 1 more op
            int result = Math.min(mismatches, 1 + Math.abs(countA1 - countB1));
            System.out.println(result);
        }

        sc.close();
    }
}
