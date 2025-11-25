package medium_1600;

import java.util.Scanner;

public class Anton_and_Fairy_Tale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        if(m>=n){
            System.out.println(n);
            return;
        }
        long ans=0;
        long lo=0,hi=Integer.MAX_VALUE;
        while (lo<=hi){
            long d=lo+(hi-lo)/2;
            if(d*(d+1)/2>=n-m){
                ans=d;
                hi=d-1;
            }
            else lo=d+1;
        }
        System.out.println(ans+m);
    }
}
