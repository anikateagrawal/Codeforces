package easy_800;

import java.util.Scanner;

public class Almost_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            char ch[][]=new char[n][n];
            int r1=-1,c1=-1,r2=-1,c2=-1;
            for(int i=0;i<n;i++){
                String s=sc.next();
                for (int j=0;j<n;j++){
                    ch[i][j]=s.charAt(j);
                    if(ch[i][j]=='*'){
                        if(r1==-1){
                            r1=i;c1=j;
                        }
                        else {
                            r2=i;c2=j;
                        }
                    }
                }
            }
            if(r1==r2){
                int nr=r1-1;
                if(nr<0)nr=r1+1;
                ch[nr][c1]='*';
                ch[nr][c2]='*';
            }
            else if(c1==c2){
                int nc=c1-1;
                if(nc<0)nc=c1+1;
                ch[r1][nc]='*';
                ch[r2][nc]='*';
            }
            else{
                ch[r1][c2]='*';
                ch[r2][c1]='*';
            }
            for (int i=0;i<n;i++){
                System.out.println(new String(ch[i]));
            }
        }
    }
}
