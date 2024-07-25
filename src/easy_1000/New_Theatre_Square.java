package easy_1000;

import java.util.Scanner;

public class New_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=0;
            char a[][]=new char[n][m];
            for (int i=0;i<n;i++){
                String s=sc.next();
                for(int j=0;j<m;j++){
                    a[i][j]=s.charAt(j);
                }
            }
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if(a[i][j]=='*')continue;
                    if(j<m-1&&a[i][j+1]=='.'){
                        if(y<2*x){
                            sum+=y;j++;
                        }
                        else sum+=x;
                    }
                    else sum+=x;
                }
            }
            System.out.println(sum);
        }
    }
}
