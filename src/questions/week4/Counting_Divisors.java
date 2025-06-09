package questions.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counting_Divisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int MAX = 1000001;

        // Step 1: Precompute number of divisors
        int[] divisors = new int[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                divisors[j]++;
            }
        }

        // Step 2: Answer each query in O(1)
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(divisors[x]);
        }
    }
}
