package medium_1300;

import java.util.Scanner;

public class Chat_Ban {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long k=sc.nextInt();
            long x=sc.nextLong();
            long lo=1,hi=2L*k-2;
            long ans=1;
            while (lo<=hi){
                long m=lo+(hi-lo)/2;
                long emotes=0;
                if(m<=k){
                    emotes=m*(m+1)/2;
                }
                else if (m>k){
                    long tot=k*(k-1)/2;
                    long r=k-1-(m-k);
                    long rs=r*(r+1)/2;
                    emotes=k*(k+1)/2+tot-rs;
//                    System.out.println(m+" "+emotes+" "+tot+" "+rs);
                }
                if(emotes<x){
                    ans=m+1;
                    lo=m+1;
                }
                else hi=m-1;

            }
            System.out.println(ans);
        }
    }
}
