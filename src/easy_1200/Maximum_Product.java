package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            long max=Math.max(1L*a[0]*a[1]*a[2]*a[3]*a[n-1],Math.max(1L*a[0]*a[1]*a[n-1]*a[n-2]*a[n-3],1L*a[n-1]*a[n-2]*a[n-3]*a[n-4]*a[n-5]));
//            for (int i=0;i<n;i++){
//                long p=1;
//                for (int j=i;j<i+5;j++){
//                    int in=j%n;
//                    p*=a[in];
//                }
//                max=Math.max(max,p);
//            }
            System.out.println(max);
        }
    }
}
