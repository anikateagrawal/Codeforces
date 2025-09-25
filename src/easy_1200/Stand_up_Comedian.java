package easy_1200;

import java.util.Scanner;

public class Stand_up_Comedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            long ans = a + Math.min(b,c)*2 + Math.min(a+1,(d + Math.abs(b-c)));
            System.out.println(a==0?1:ans);
        }
    }
}
