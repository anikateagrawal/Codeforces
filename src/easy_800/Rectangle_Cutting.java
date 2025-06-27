package easy_800;

import java.util.Scanner;

public class Rectangle_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anurag = sc.nextInt();
        while (anurag-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(((a % 2 == 0 && (2 * b != a)) || (b % 2 == 0 && (2 * a != b))) ? "YES" : "NO");
        }
    }
}
