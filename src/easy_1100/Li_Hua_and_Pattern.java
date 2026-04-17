package easy_1100;

import java.util.Scanner;

public class Li_Hua_and_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int mat[][]=new int[n][n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++)mat[i][j]=sc.nextInt();
            }
            int c=0;
            for (int i=0;i<(n*n)/2;i++){
                int c1=i/n;
                int r1=i%n;
                int c2=n-c1-1;
                int r2=n-r1-1;
                if (mat[r1][c1]!=mat[r2][c2])c++;
            }
            k-=c;
            if (k<0) System.out.println("NO");
            else if (k%2==1){
                if (n%2==1) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
