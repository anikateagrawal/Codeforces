package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Boredom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f[]=new int[1000000];
        for (int i = 0; i < n; i++) {
            f[sc.nextInt()]++;
        }
        long dp[]=new long[1000000];
        dp[1]=f[1];
        for(int i=2;i<1000000;i++){
            long max=dp[i-2]+1L*f[i]*i;
            max=Math.max(max,dp[i-1]);
            dp[i]=max;
        }
        System.out.println(dp[dp.length-1]);
    }
}
