package easy_800;

import java.util.Scanner;

public class Mr_Perfectly_Fine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
            int ab=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int tt=sc.nextInt();
                String s=sc.next();
                if(s.equals("10"))a=Math.min(a,tt);
                else if (s.equals("01"))b=Math.min(b,tt);
                else if(s.equals("11")){
                    ab=Math.min(ab,tt);
                    a=Math.min(a,tt);
                    b=Math.min(b,tt);
                }
            }
            if (a==Integer.MAX_VALUE||b==Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(Math.min(a+b,ab));
        }
    }
}
