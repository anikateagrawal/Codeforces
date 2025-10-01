package easy_800;

import java.util.Scanner;

public class Robot_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=Math.abs(m-n);
            if(d<=1) System.out.println(m+n);
            else System.out.println(m+n+d-1);
        }
    }
}
