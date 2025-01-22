package easy_1000;

import java.util.Scanner;

public class X_Sum {
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
            int max=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++)max=Math.max(max,sum(a,i,j));
            }
            System.out.println(max);
        }
    }
    static  int sum(int a[][],int i,int j){
        int sum=a[i][j];
        int m=i,n=j;
        while (--m>=0 && --n>=0)sum+=a[m][n];
        m=i;n=j;
        while (--m>=0 && ++n<a[0].length)sum+=a[m][n];
        m=i;n=j;
        while (++m<a.length && --n>=0)sum+=a[m][n];
        m=i;n=j;
        while (++m<a.length && ++n<a[0].length)sum+=a[m][n];
        return sum;
    }
}
