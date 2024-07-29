package easy_800;

import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[][]=new int[n][n];
            for (int i=0;i<n;i++){
                String s=sc.next();
                for (int j=0;j<n;j++){
                    a[i][j]=s.charAt(j)-'0';
                }
            }
            for (int i=0;i<n;i+=k){
                for (int j=0;j<n;j+=k){
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
