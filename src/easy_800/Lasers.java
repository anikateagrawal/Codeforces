package easy_800;

import java.util.Scanner;

public class Lasers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0) {
            int n = s.nextInt(), m = s.nextInt(), x = s.nextInt(), y = s.nextInt();
            for (int i = 0; i < n; i++) s.nextInt();
            for (int i = 0; i < m; i++) s.nextInt();
            System.out.println(n + m);
        }
    }
}
