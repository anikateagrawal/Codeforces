package easy_1000;

import java.util.Scanner;

public class Deadly_Laser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int sx=sc.nextInt();
            int sy=sc.nextInt();
            int d=sc.nextInt();
            int maxy=Math.max(sy,m-sy);
            int maxx=Math.max(sx,n-sx);
            if (maxy<=d || maxx<=d) System.out.println(-1);
            else System.out.println(m+n-2);
        }
    }
}
