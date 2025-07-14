package medium_1600;

import java.util.*;

public class Array_Walk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int z = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxScore = 0;
            int sum = 0;
            int maxPair = 0;

            for (int i = 0; i <= k; i++) {
                if (i < n) {
                    sum += a[i];
                }
                if (i < n - 1) {
                    maxPair = Math.max(maxPair, a[i] + a[i + 1]);
                }

                int remainingMoves = k - i;
                if (remainingMoves % 2 == 0 && remainingMoves / 2 <= z) {
                    int leftsUsed = remainingMoves / 2;
                    int score = sum + leftsUsed * maxPair;
                    maxScore = Math.max(maxScore, score);
                }
            }

            System.out.println(maxScore);
        }

        sc.close();
    }
}