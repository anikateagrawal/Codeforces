import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ready {
    static int ct;
    static int rp,cp;
    static int wt;
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            char b[][]=new char[r][c];
            for(int i=0;i<r;i++){
                String s=sc.next();
                for(int j=0;j<c;j++)b[i][j]=s.charAt(j);
            }
            Map<String,Integer> m=new HashMap<>();
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(b[i][j]=='W')
                    {
                        ct=0;
                        wt=0;
                        rp=-1;cp=-1;
                        count(b,i,j);
                        if(ct==1){
                            String ky=""+rp+" "+cp;
                            m.put(ky,m.getOrDefault(ky,0)+wt);
                        }
                    }
                }
            }
            int ans=0;
            for(int ky:m.values()){
                ans=Math.max(ans,ky);
            }
            System.out.println("Case #"+k+": "+ans);

        }
    }
    static void count(char b[][],int i,int j){
        if(i<0||i>=b.length||j<0||j>=b[0].length||b[i][j]=='B')return ;
        if(b[i][j]=='.'){
            if(i==rp&&j==cp)return;
            rp=i;cp=j;
            ct++;return;
        }
        wt++;
        b[i][j]='B';
        count(b,i+1,j);
        count(b,i-1,j);
        count(b,i,j+1);
        count(b,i,j-1);
    }
}
