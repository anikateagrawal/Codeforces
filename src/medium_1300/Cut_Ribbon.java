package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Cut_Ribbon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        for(int i=0;i<=n;i++){
            if(i>=a){
                dp[i]=Math.max(dp[i],1+dp[i-a]);
            }
            if(i>=b){
                dp[i]=Math.max(dp[i],1+dp[i-b]);
            }
            if(i>=c){
                dp[i]=Math.max(dp[i],1+dp[i-c]);
            }
        }
        System.out.println(dp[n]);
    }
}
