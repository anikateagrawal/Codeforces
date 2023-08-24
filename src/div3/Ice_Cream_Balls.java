package div3;

import java.util.Scanner;

public class Ice_Cream_Balls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long lo=2,hi=Integer.MAX_VALUE;
            long ans=2;
            while (lo<=hi){
                long mid=lo+(hi-lo)/2;
                if(mid*(mid-1)/2<=n){
                    ans=mid;
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            ans+=n-ans*(ans-1)/2;
            System.out.println(ans);
        }
    }
}
