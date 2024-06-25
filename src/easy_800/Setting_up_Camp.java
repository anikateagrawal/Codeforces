package easy_800;

import java.util.Scanner;

public class Setting_up_Camp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int min=a+b/3;
            b%=3;
            if(b!=0&&(b+c)<3) System.out.println(-1);
            else System.out.println(min+(b+c+2)/3);
        }
    }
}
