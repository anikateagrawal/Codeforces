package easy_1200;

import java.util.Scanner;

public class Cat_Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long extra = (k - 1) / (n - 1);
            long result = (k + extra - 1) % n + 1;

            System.out.println(result);
        }
    }
}
