package easy_1100;

import java.util.*;
public class Maximum_Sum_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long mod=1000000007;
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)	arr[i]=sc.nextInt();
            long runmax=0,maxi=0;
            long ans=0;
            for(int i=0;i<n;i++) {
                ans+=arr[i];
                runmax+=arr[i];
                maxi=Math.max(maxi, runmax);
                runmax=Math.max(runmax, 0);
            }
            long power=maxi;
            for(int i=1;i<=k;i++) {
                power*=2;
                power%=mod;
            }
            power-=maxi;
            ans+=power;
            ans=ans%mod;
            if(ans<0)	ans=mod+ans;
            System.out.println(ans);
        }
        sc.close();
    }
}
