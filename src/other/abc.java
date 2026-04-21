package other;

import java.util.*;
// Write a program to print natural numbers 1 to N

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for (int i=n;i>=1;i--){
//            System.out.print(i+" ");
//        }
        fun(n);
    }
    static void fun(int n){
        if(n<1)return;

        fun(n-1);
        System.out.print(n+" ");
    }
}
