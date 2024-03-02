package easy_800;

import java.util.Scanner;

public class Brick_Wall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int  m=sc.nextInt();
            int b=0;
            b+=m/2*n;
            System.out.println(b);
        }
    }
}
