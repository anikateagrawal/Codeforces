package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Ezzat_and_Two_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            long s=0;
            for (int i=0;i<n-1;i++)s+=a[i];
            System.out.println(s*1.0/(n-1)+a[n-1]);
        }
    }
}
