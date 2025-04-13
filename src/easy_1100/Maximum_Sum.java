package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            long total=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                total+=a[i];
            }
            Arrays.sort(a);
            long lsum[]=new long[n+1];
            long rsum[]=new long[n+1];
            for (int i=1;i<=n;i++)lsum[i]=a[i-1]+lsum[i-1];
            for (int i=n-1;i>=0;i--)rsum[i]=a[i]+rsum[i+1];

            long ans=Long.MAX_VALUE;
            for (int i=0;i<=k;i++){
                int li=i*2;
                int ri=k-i;
                ans=Math.min(ans,lsum[li]+rsum[n-ri]);
            }
            System.out.println(total-ans);
        }
    }
}
