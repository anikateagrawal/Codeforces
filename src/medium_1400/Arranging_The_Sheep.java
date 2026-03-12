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
            if(s.charAt(0)=='*')l[0]=1;
            for (int i=1;i<n;i++){
                l[i]=s.charAt(i)=='*'?l[i-1]+1:l[i-1];
            }
            int r[]=new int[n];
            if (s.charAt(n-1)=='*')r[n-1]=1;
            for (int i=n-2;i>=0;i--){
                r[i]=s.charAt(i)=='*'?r[i+1]+1:r[i+1];
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
