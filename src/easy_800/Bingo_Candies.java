package easy_800;

import java.util.Scanner;

public class Bingo_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int mat[][]=new int[n][n];
            int f[]=new int[n*n+1];
            int max=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                    f[mat[i][j]]++;
                    max=Math.max(max,f[mat[i][j]]);
                }
            }
            if (max>n*(n-1)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
