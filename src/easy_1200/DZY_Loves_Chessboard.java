package easy_1200;

import java.util.Scanner;

public class DZY_Loves_Chessboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char b[][]=new char[n][m];
        for (int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++)b[i][j]=s.charAt(j);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(b[i][j]=='.'){
                    fill(b,i,j,'B');
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
    public static void fill(char b[][],int r,int c,char ch){
        if(r<0||r>=b.length||c<0||c>=b[0].length||b[r][c]!='.')return;
        char nx='W';
        if(ch=='W')nx='B';
        b[r][c]=ch;
        fill(b,r+1,c,nx);
        fill(b,r-1,c,nx);
        fill(b,r,c+1,nx);
        fill(b,r,c-1,nx);
    }
}
