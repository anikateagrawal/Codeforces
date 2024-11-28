package easy_800;

import java.util.Scanner;

public class Not_Shading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=sc.nextInt()-1;
            int c=sc.nextInt()-1;
            char g[][]=new char[n][m];
            boolean b=false;
            for (int i=0;i<n;i++){
                String s=sc.next();
                for (int j=0;j<m;j++){
                    g[i][j]=s.charAt(j);
                    if(g[i][j]=='B')b=true;
                }
            }
            if(!b) System.out.println(-1);
            else if(g[r][c]=='B') System.out.println(0);
            else{
                b=false;
                for (int i=0;i<n;i++){
                    if(i==r)continue;
                    if(g[i][c]=='B')b=true;
                }
                for (int i=0;i<m;i++){
                    if(i==c)continue;
                    if (g[r][i]=='B')b=true;
                }
                if(b) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
