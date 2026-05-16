package easy_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Little_Artem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            char a[][]=new char[n][m];
            for(char arr[]:a){
                Arrays.fill(arr,'B');
            }
            a[n-1][m-1]='W';
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
