package easy_1000;

import java.util.Scanner;

public class Berland_Poker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();int m=sc.nextInt();int k=sc.nextInt();
            int p=n/k;
            int mp=Math.min(p,m);
            m-=mp;
            int y=(int)Math.ceil(m*1.0/(k-1));
            System.out.println(mp-y);
        }
    }
}
