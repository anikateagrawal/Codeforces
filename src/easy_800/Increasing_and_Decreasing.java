package easy_800;

import java.util.Scanner;

public class Increasing_and_Decreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int s=n*(n-1)/2;
            if(x+s>y) System.out.println(-1);
            else {
                int a[]=new int[n];
                a[n-1]=y;
                a[0]=x;
                int d=1;
                for (int i=n-2;i>0;i--){
                    a[i]=a[i+1]-d;
                    d++;
                }
                for (int i=0;i<n;i++) System.out.print(a[i]+" ");
                System.out.println();
            }
        }
    }
}
