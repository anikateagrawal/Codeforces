package easy_900;

import java.util.Scanner;

public class Lights_Out {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dr[]={1,-1,0,0};
        int dc[]={0,0,1,-1};
        int g[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a=sc.nextInt();
                if(a%2==0)continue;
                g[i][j]=1-g[i][j];
                for(int k=0;k<4;k++){
                    int nr=i+dr[k];
                    int nc=j+dc[k];
                    if(nr<0||nr>=3||nc<0||nc>=3)continue;
                    g[nr][nc]=1-g[nr][nc];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(1-g[i][j]);
            }
            System.out.println();
        }
    }
}
