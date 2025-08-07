package easy_1000;

import java.util.Scanner;

public class Prefix_Min_and_Suffix_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int lmin[]=new int[n];
            int rmax[]=new int[n];
            lmin[0]=a[0];
            for (int i=1;i<n;i++)lmin[i]=Math.min(lmin[i-1],a[i]);

            rmax[n-1]=a[n-1];
            for (int i=n-2;i>=0;i--){
                rmax[i]=Math.max(rmax[i+1],a[i]);
            }
            for (int i=0;i<n;i++){
                if(a[i]==lmin[i]||a[i]==rmax[i]) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
