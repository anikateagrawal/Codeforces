package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Sage_s_Birthday_easy_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int mi=n/2;
        int ans[]=new int[n];
        for (int i=0;i<n;i+=2){
            ans[i]=a[mi];
            mi++;
        }
        mi=0;
        for (int i=1;i<n;i+=2){
            ans[i]=a[mi];
            mi++;
        }
        System.out.println((n-1)/2);
        for (int i:ans) System.out.print(i+" ");
        System.out.println();
    }
}
