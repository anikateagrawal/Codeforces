package easy_1000;

import java.util.Scanner;

public class Red_and_Blue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int m=sc.nextInt();
            int b[]=new int[m];
            for (int i=0;i<m;i++)b[i]=sc.nextInt();

            int csa[]=new int[n+1];
            int csb[]=new int[m+1];
            for (int i=0;i<n;i++)csa[i+1]=a[i]+csa[i];
            for (int i=0;i<m;i++)csb[i+1]=b[i]+csb[i];
            int max=0;
            for (int i=0;i<n+1;i++){
                for (int j=0;j<m+1;j++){
                    max=Math.max(max,csa[i]+csb[j]);
                }
            }
            System.out.println(max);
        }
    }
}
