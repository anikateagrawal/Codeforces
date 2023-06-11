package easy_1000;

import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=sc.nextInt();
        long a=sc.nextInt();
        long c=(long)(Math.ceil(n*1.0/a)*Math.ceil(m*1.0/a));
        System.out.println(c);
    }
}
