package easy_1200;

import java.util.Scanner;

public class Petr_and_a_Combination_Lock {
    static  boolean flag=false;
    static int mod=360;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        fun(a,0,0);
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
    static void fun(int a[],int i,int deg){
        if(i==a.length){
            if(deg==0)flag=true;
            return;
        }
        fun(a,i+1,(deg+a[i])%mod);
        fun(a,i+1,(deg-a[i]+mod)%mod);
    }
}
