package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Vacations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d[]=new int[n];
        for (int i=0;i<n;i++)d[i]=sc.nextInt();
        int dp[][]=new int[n][3];
        for (int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        System.out.println(n-fun(d,0,0,dp));
    }
    static int fun(int d[],int in,int p,int dp[][]){
        if(in==d.length){
            return 0;
        }
        if(dp[in][p]!=-1)return dp[in][p];
        int max=-1;
        if(d[in]==0){
            max=fun(d,in+1,0,dp);
        }
        else if(d[in]==1){
            if(p==1)max= fun(d,in+1,0,dp);
            else{
                max=fun(d,in+1,1,dp)+1;
            }
        }
        else if(d[in]==2){
            if(p==2)max=fun(d,in+1,0,dp);
            else max=fun(d,in+1,2,dp)+1;
        }
        else {
            if(p==2)max=Math.max(fun(d,in+1,1,dp)+1,fun(d,in+1,0,dp));
            else if(p==1)max=Math.max(fun(d,in+1,2,dp)+1,fun(d,in+1,0,dp));
            else max=Math.max(fun(d,in+1,1,dp),fun(d,in+1,2,dp))+1;
        }
        return dp[in][p]=max;
    }
}
