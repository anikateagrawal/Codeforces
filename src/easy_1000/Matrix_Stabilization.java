package easy_1000;

import java.util.Scanner;

public class Matrix_Stabilization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int[n][m];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++)a[i][j]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    int top=0,bottom=0,right=0,left=0;
                    if(i>0)top=a[i-1][j];
                    if(i<n-1)bottom=a[i+1][j];
                    if(j>0)left=a[i][j-1];
                    if(j<m-1)right=a[i][j+1];
                    int max=Math.max(left,Math.max(right,Math.max(top,bottom)));
                    if(a[i][j]>max){
                        a[i][j]=max;
                    }
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
