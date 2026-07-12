package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Summation_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int tot=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tot+=a[i];
            }
            Arrays.sort(a);
            int max=Integer.MIN_VALUE;
            for (int i=n-1;i>=0;i--){
                tot-=2*a[i];
                if (i>n-x)continue;
                max=Math.max(max,tot);
                if (i>n-x-k){
                    tot+=a[i+x-1];
                }
                else break;
            }
            if (x+k>n){
                int m=0;
                for (int i=0;i<n-k;i++)m+=-1*a[i];
                max=Math.max(max,m);
            }
            System.out.println(max);
        }
    }
}
