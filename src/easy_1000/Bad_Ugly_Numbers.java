package easy_1000;

import java.util.Scanner;

public class Bad_Ugly_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println(-1);
            else {
                StringBuilder ans=new StringBuilder("45");
                n-=2;
                while (n-->0)ans.append("5");
                ans.reverse();
                System.out.println(ans.toString());
            }
        }
    }
}
