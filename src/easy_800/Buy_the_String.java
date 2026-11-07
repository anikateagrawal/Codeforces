package easy_800;

import java.util.Scanner;

public class Buy_the_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c0=sc.nextInt();
            int c1=sc.nextInt();
            int h=sc.nextInt();
            String s=sc.next();
            int ans=0;
            for (char ch:s.toCharArray()){
                if (ch=='0') ans+=Math.min(c0,c1+h);
                else ans+=Math.min(c1,c0+h);
            }
            System.out.println(ans);
        }
    }
}
