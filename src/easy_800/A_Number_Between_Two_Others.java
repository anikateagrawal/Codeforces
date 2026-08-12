package easy_800;

import java.util.Scanner;

public class A_Number_Between_Two_Others {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long d=y/x;
            if (y%x==0)d--;
            long z=x*d;
            if (y%z==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
