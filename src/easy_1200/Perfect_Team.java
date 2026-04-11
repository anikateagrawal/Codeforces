package easy_1200;

import java.util.Scanner;

public class Perfect_Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            int c=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int lo=0,hi=Math.min(c,m);
            int t=0;
            while (lo<=hi){
                int mid=lo+(hi-lo)/2;
                int r=c+m-2*mid+x;
                if (r>=mid){
                    t=mid;
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            System.out.println(t);
        }
    }
}
