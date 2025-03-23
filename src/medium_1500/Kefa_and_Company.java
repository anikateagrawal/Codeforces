package medium_1500;

import java.util.Arrays;
import java.util.Scanner;

public class Kefa_and_Company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        long a[][]=new long[n+1][2];
        for (int i=1;i<=n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(i1,i2)->Long.compare(i1[0],i2[0]));
        for(int i=1;i<=n;i++){
            a[i][1]+=a[i-1][1];
        }
        long max=0;
        for (int i=1;i<=n;i++){
            int in=search(a,a[i][0]+d);
            long diff=a[in][1]-a[i-1][1];
            max=Math.max(max,diff);
        }
        System.out.println(max);
    }
    static int search(long a[][],long k){
        int lo=0,hi=a.length-1;
        int ans=-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid][0]<=k){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
}
