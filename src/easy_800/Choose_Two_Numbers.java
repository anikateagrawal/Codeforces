package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Choose_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int m=sc.nextInt();
        int b[]=new int[m];
        for (int i=0;i<m;i++)b[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a[n-1]+" "+b[m-1]);
    }
}
