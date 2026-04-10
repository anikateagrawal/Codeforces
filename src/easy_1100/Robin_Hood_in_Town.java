package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Robin_Hood_in_Town {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            if (n<=2) {
                System.out.println(-1);
                continue;
            }
            Arrays.sort(a);
            int ravg=a[n/2];
            int max=a[n-1];
            long lo=0,hi=2L*max*n;
            long x=hi;
            while (lo<=hi){
                long mid=lo+(hi-lo)/2;
                double avg=(sum+mid+0.0)/n;
                if (avg/2>ravg){
                    x=mid;
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            System.out.println(x);
        }
    }
}
