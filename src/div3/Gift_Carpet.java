package div3;

import java.util.Scanner;

public class Gift_Carpet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            char a[][]=new char[n][m];
            for(int i=0;i<n;i++){
                String s=sc.next();
                for (int j=0;j<m;j++){
                    a[i][j]=s.charAt(j);
                }
            }
            String v="vika";
            for(int i=0;i<m;i++){
                char ch=v.charAt(0);
                for (int j = 0; j < n; j++) {
                    if(a[j][i]==ch){
                        v=v.substring(1);
                        break;
                    }
                }
                if(v.length()==0)break;
            }
            if(v.length()==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
