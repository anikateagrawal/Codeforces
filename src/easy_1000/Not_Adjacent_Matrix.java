package easy_1000;

import java.util.Scanner;

public class Not_Adjacent_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==2) System.out.println(-1);
            else {
                int a[][]=new int[n][n];
                int d=1;
                for(int i=0;i<n*n;i+=2){
                    int ri=i/n;
                    int ci=i%n;
                    a[ri][ci]=d++;
                }
                for(int i=1;i<n*n;i+=2){
                    int ri=i/n;
                    int ci=i%n;
                    a[ri][ci]=d++;
                }
                for (int i = 0; i < n; i++) {
                    for (int j=0;j<n;j++) System.out.print(a[i][j]+" ");
                    System.out.println();
                }
            }
        }
    }
}
