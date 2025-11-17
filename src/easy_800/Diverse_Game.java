package easy_800;

import java.util.Scanner;

public class Diverse_Game {
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
            if(n==1 && m==1) System.out.println(-1);
            else {
                if(m==1){
                    for (int i=1;i<n;i++) System.out.println(a[i][0]);
                    System.out.println(a[0][0]);
                }
                else {
                    for (int i=0;i<n;i++){
                        for (int j=1;j<m;j++) System.out.print(a[i][j]+" ");
                        System.out.println(a[i][0]);
                    }
                }
            }
        }
    }
}
