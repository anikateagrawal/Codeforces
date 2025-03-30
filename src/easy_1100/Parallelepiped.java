package easy_1100;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long abc=(long)Math.sqrt(1L*a*b*c);
        System.out.println(4*(abc/a+abc/b+abc/c));
    }
}
