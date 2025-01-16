package easy_1000;

import java.util.Scanner;

public class Valera_and_X {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c[][]=new char[n][n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for (int j=0;j<n;j++){
                c[i][j]=s.charAt(j);
            }
        }
        char d=c[0][0],o=c[0][1];
        boolean flag=true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    if(c[i][j]!=d)flag=false;
                }
                else if(c[i][j]!=o)flag=false;
            }
        }
        if(flag && d!=o) System.out.println("YES");
        else System.out.println("NO");
    }
}
