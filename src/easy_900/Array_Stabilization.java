package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Stabilization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=Math.min(a[n-1]-a[1],a[n-2]-a[0]);
        System.out.println(ans);
    }
}
