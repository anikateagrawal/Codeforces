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
            boolean way1 =  sy-1<=d || n-sx<=d;
            boolean way2 =  sx-1<=d || m-sy<=d;
            if (way1 && way2) System.out.println(-1);
            else System.out.println(m+n-2);
        }
    }
}
