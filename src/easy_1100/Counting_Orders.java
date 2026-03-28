package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Counting_Orders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int i=n-1,j=n-1;
            long ans=1;
            int mod=(int)(1e9+7);
            while (j>=0){
                while (i>=0 && a[i]>b[j])i--;
                int p=n-i-(n-j);
                ans=(ans*p)%mod;
                j--;
            }
            System.out.println(ans);
        }
    }
}
