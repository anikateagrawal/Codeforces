package contests;

import java.util.Arrays;
import java.util.Scanner;

public class Odd_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            long l[]=new long[n+1];
            long r[]=new long[n+1];
            long a[]=new long[n];
            for (int i = 0; i <n ; i++) {
                a[i]=sc.nextLong();
            }
            for (int i = 1; i <= n; i++) {
                l[i]=l[i-1]+a[i-1];
            }
            for (int i = n-1; i >=0 ; i--) {
                r[i]=r[i+1]+a[i];
            }
//            System.out.println(Arrays.toString(r));
            while (q-->0){
                int s=sc.nextInt()-1;
                int e=sc.nextInt();
                int k=sc.nextInt();
                long sum=0L+l[s]+r[e]+(e-s)*1L*k;
//                System.out.println("svd"+l[s]+" "+r[e]+" "+((e-s+1)*1L*k));
                if(sum%2==1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
