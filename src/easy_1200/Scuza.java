package easy_1200;

import java.util.Scanner;

public class Scuza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            long p[]=new long[n+1];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                p[i+1]=a[i];
                if(i>0){
                    p[i+1]+=p[i];
                    a[i]=Math.max(a[i],a[i-1]);
                }
            }
            while (q-->0){
                int k=sc.nextInt();
                int in= search(a,k);
                System.out.print(p[in]+" ");
            }
            System.out.println();
        }
    }
    static int search(int a[],int k){
        int lo=0,hi=a.length-1;
        int ans=0;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]<=k){
                ans=mid+1;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
}
