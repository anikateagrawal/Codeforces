package easy_800;

import java.util.Scanner;

public class Robot_Cleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m, rb, cb, rd, cd;
            n = sc.nextInt();
            m = sc.nextInt();
            rb = sc.nextInt();
            cb = sc.nextInt();
            rd = sc.nextInt();
            cd = sc.nextInt();

            int c, r;

            if (rd < rb) {
                r = n - rb + (n - rd);
            } else {
                r = rd - rb;
            }

            if (cd < cb) {
                c = m - cb + (m - cd);
            } else {
                c = cd - cb;
            }

            System.out.println(Math.min(r, c));
        }

    }
}
