package easy_1100;

import java.util.Scanner;

public class Ilya_and_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        int n=s.length();
        int dp[]=new int[n+1];
        int c=0;
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)==s.charAt(i+1))c++;
            dp[i+1]=c;
        }
        while (q-->0){
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            System.out.println(dp[r]-dp[l]);
        }
    }
}
