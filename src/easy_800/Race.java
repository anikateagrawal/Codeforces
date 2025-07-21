package easy_800;

import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);

            if( a < min || a > max) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
