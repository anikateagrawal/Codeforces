package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        long p[]=new long[n+1];

        for (int i=0;i<n;i++)p[i+1]=sc.nextInt();
        Arrays.sort(p);
        for (int i=1;i<=n;i++)p[i]+=p[i-1];
        while (q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            long max=p[n-x+y]-p[n-x];
            System.out.println(max);
        }
    }
}
