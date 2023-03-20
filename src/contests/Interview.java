package contests;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long cf[]=new long[n+1];
            long sum=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
                cf[i]=sum;
            }

            int in=0;
            int lo=0;int hi=n-1;
            while (lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(lo==0)sum=cf[mid];
                else {
                    sum=cf[mid]-cf[lo-1];
                }
                System.out.print("? "+(mid-lo+1)+" ");
                for (int i = lo; i <=mid ; i++) {
                    System.out.print((i+1)+" ");
                }
                System.out.println();
                long x=sc.nextLong();
                if(x!=sum){
                    in=mid+1;
                    hi=mid-1;
                }else {
                    lo=mid+1;
                }
            }
            System.out.println("! "+in);
        }
    }
}
