package easy_1000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Farmer_Johns_Card_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c[][]=new int[n][m+1];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    c[i][j]=sc.nextInt();
                }
                c[i][m]=Integer.MAX_VALUE;
                Arrays.sort(c[i]);
                c[i][m]=i+1;
            }
            Arrays.sort(c,(i1,i2)->i1[0]-i2[0]);
            boolean flag=true;
            int p=-1;
            for (int i=0;i<m;i++){
                for (int j=0;j<n;j++){
                    if(c[j][i]<=p){
                        flag=false;
                    }
                    p=c[j][i];
                }
            }
            if(flag){
                for (int i=0;i<n;i++) System.out.print(c[i][m]+" ");
                System.out.println();
            }
            else System.out.println(-1);
        }
    }
}
