package easy_800;

import java.util.Scanner;

public class A_M_Deviation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=(a+c-2*b);
            if(d%3==0) System.out.println(0);
            else
            System.out.println(1);
        }
    }
}
