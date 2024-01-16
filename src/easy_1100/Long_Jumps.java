package easy_1100;

import java.util.Scanner;

public class Long_Jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int dp[]=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                if(i+a[i]<n){
                    dp[i+a[i]]=Math.max(a[i]+dp[i],dp[i+a[i]]);
                    max=Math.max(max,dp[i+a[i]]);
                }
                else{
                    max=Math.max(max,a[i]+dp[i]);
                }
            }
            System.out.println(max);
        }
    }
}
