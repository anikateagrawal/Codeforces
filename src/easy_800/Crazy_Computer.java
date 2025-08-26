package easy_800;

import java.util.Scanner;

public class Crazy_Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int total = 0;
        int prev = 0;
        for (int i=0; i<n; i++) {
            int curr = sc.nextInt();
            if (curr-prev>c) total=1; else total++;
            prev=curr;
        }
        System.out.println(total);
    }
}
