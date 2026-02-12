package easy_1000;

import java.util.Scanner;

public class Red_Versus_Blue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int r=sc.nextInt();
            int b=sc.nextInt();
            String ans="";
            int d=r/(b+1);
            for (int i=0;i<b;i++){
                for (int j=0;j<d;j++)ans+="R";
                if(i<(r%(b+1)))ans+="R";
                ans+="B";
            }
            for (int i=ans.length();i<n;i++)ans+="R";
            System.out.println(ans);
        }
    }
}
