package questions;

import java.util.Scanner;

public class The_last_2_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        long result = A % 100;
        result = (result * (B % 100)) % 100;
        result = (result * (C % 100)) % 100;
        result = (result * (D % 100)) % 100;

        // Print with leading zero if needed (e.g., 04 instead of 4)
        System.out.printf("%02d\n", result);
    }
}
