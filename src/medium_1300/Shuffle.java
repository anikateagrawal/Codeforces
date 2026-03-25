package medium_1300;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int m=sc.nextInt();
            int lx=x;
            int rx=x;
            for (int i=0;i<m;i++){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(Math.max(l,lx)-Math.min(r,rx)<=0){
                    lx=Math.min(lx,l);
                    rx=Math.max(rx,r);
                }
            }
            System.out.println(rx-lx+1);

        }
    }
}
