package easy_800;

import java.util.Scanner;

public class Cakeminator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int g[][]=new int[n][m];
        int r[]=new int[n];
        int c[]=new int[m];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='S'){
                    g[i][j]=1;
                    r[i]++;
                    c[j]++;
                }
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            if(r[i]==0)k+=m;
        }
        for(int i=0;i<m;i++)if(c[i]==0)k+=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==0&&c[j]==0)k--;
            }
        }
        System.out.println(k);
    }
}
