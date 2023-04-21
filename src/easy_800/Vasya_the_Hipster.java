package easy_800;

import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.print(Math.min(n,x)+" ");
        System.out.println((n+x-2*Math.min(n,x))/2);
    }
}
