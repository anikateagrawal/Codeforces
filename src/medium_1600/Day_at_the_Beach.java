package medium_1600;

import java.util.Scanner;

public class Day_at_the_Beach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int lmax[]=new int[n+1];
        int rmin[]=new int[n+1];
        lmax[0]=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lmax[i+1]=Math.max(lmax[i],a[i]);
        }
        rmin[n]=Integer.MAX_VALUE;
        for (int i = n-1; i >=0; i--) {
            rmin[i]=Math.min(rmin[i+1],a[i]);
        }
        int p=1;
        for (int i = 1; i < n; i++) {
            if(lmax[i]<=rmin[i])p++;
        }
        System.out.println(p);
    }
}
