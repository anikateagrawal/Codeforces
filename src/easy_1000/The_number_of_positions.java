package easy_1000;

import java.util.Scanner;

public class The_number_of_positions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=Math.max(a,n-b-1);
        System.out.println(n-l);
    }
}
