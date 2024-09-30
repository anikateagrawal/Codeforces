package easy_800;

import java.util.Scanner;

public class Array_Decrements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            int max=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                b[i]=sc.nextInt();
                max=Math.max(max,a[i]-b[i]);
            }
            boolean flag=true;
            for (int i=0;i<n;i++){
                a[i]=Math.max(0,a[i]-max);
                if(b[i]!=a[i]){
                    flag=false;
                    break;
                }
            }
            if(flag&&max>=0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
