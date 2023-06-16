package easy_1000;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        System.out.println(Math.max(a+b*c,Math.max(a*(b+c),Math.max(a*b*c,Math.max(a+b+c,(a+b)*c)))));
    }
}
