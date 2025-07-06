package questions.hack_with_infy;

import java.util.*;

public class easy1 {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int[] A = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Read number of queries
        int q = sc.nextInt();

        long totalSum = 0;

        // Process each query
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt() ;  // Convert to 0-based index
            int r = sc.nextInt() ;

            if (type == 1) {
                int base = A[l];
                for (int j = l; j <= r; j++) {
                    A[j] = (int)(((long)(j - l + 1) * base) % MOD);
                }
            } else if (type == 2) {
                long sum = 0;
                for (int j = l; j <= r; j++) {
                    sum = (sum + A[j]) % MOD;
                }
                totalSum = (totalSum + sum) % MOD;
            }
        }

        // Output the final result
        System.out.println(totalSum);
    }
}
