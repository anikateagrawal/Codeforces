package easy_800;

import java.util.Scanner;

public class Puzzle_From_the_Future {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            StringBuilder a = new StringBuilder();
            int prev = 0;
            for (int i = 0; i < n; i++) {
                int current = b.charAt(i) - '0';
                if (current + 1 != prev) {
                    a.append('1');
                    prev = current + 1;
                } else {
                    a.append('0');
                    prev = current;
                }
            }
            System.out.println(a);
        }
    }
}
