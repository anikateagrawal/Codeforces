package easy_900;

import java.util.Scanner;

public class Modular_Exponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        n=Math.min(n,31);
        System.out.println((int)(m%Math.pow(2,n)));
    }
}
