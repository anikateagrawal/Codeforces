package div3;

import java.util.Arrays;
import java.util.Scanner;

public class Power_of_Points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            Arrays.sort(b);
            long pr[]=new long[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                sum+=b[i];
                pr[i]=sum;
            }
            for (int i = 0; i < n; i++) {
                int x=Arrays.binarySearch(b,a[i]);
                long ans;
                if(x==0)ans=sum-1L*a[i]*n;
                else {
                    ans=sum-pr[x-1]-1L*(n-x)*a[i];
                    ans+=1L*x*a[i]-pr[x-1];
                }
                System.out.print((ans+n)+" ");
            }
            System.out.println();

        }
    }
}
