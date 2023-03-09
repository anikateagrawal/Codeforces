package contests;

import java.util.Scanner;

public class The_Very_Beautiful_Blanket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            fun(n,m);
        }
    }
    static void fun(int n,int m){
        int a[][]=new int[n][m];
        System.out.println(n*m);
        int rr=1;
        for (int i = 0; i < n; i++) {
            int tt=rr;
            for (int j = 0; j < 10; j++) {
                tt*=2;
            }
            for (int j = 0; j < m; j++) {
                System.out.print(j+1+tt+" ");
            }
            rr++;
            System.out.println();
        }

    }
}
