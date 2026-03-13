package medium_1400;

import java.util.Scanner;

public class Arranging_The_Sheep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int l[]=new int[n];
            int ast=0;
            for (int i=0;i<n;i++){
                if(s.charAt(i)=='*')ast++;
                l[i]=ast;
            }
            int r[]=new int[n];
            ast=0;
            for (int i=n-1;i>=0;i--){
                if(s.charAt(i)=='*')ast++;
                r[i]=ast;
            }
            long ans=0;
            for (int i=0;i<n;i++){
                if (s.charAt(i)=='.'){
                    ans+=Math.min(l[i],r[i]);
                }
            }
            System.out.println(ans);
        }
    }
}
