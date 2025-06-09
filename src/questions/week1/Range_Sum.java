package questions.week1;

import java.util.Scanner;

public class Range_Sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            // Read input
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            // Calculate sum from L to R using the formula
            long L = Math.min(a,b);
            long R = Math.max(a,b);
            long count = R - L + 1;
            long sum = count * (L + R) / 2;
            System.out.println(sum);
        }
    }
}
