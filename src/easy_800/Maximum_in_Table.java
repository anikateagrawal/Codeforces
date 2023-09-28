package easy_800;

import java.util.Scanner;

public class Maximum_in_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(i==0||j==0){
                    a[i][j]=1;
                    continue;
                }
                a[i][j]=a[i][j-1]+a[i-1][j];
            }
        }
        System.out.println(a[n-1][n-1]);
    }
}
