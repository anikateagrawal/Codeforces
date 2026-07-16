package easy_1200;

import java.util.Scanner;

public class Substring_and_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            int dp[][]=new int[a.length()+1][b.length()+1];
            for (int i=1;i<dp.length;i++){
                for (int j=1;j<dp[0].length;j++){
                    if (a.charAt(i-1)==b.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            int ans=a.length()+b.length()-dp[a.length()][b.length()];
            System.out.println(ans);
        }
    }
}
