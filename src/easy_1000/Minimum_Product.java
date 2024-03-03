package easy_1000;

import java.util.Scanner;

public class Minimum_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int n=sc.nextInt();
            int d1=a-c,d2=b-d;
            int m1=a-Math.min(d1,n);
            int m2=b-Math.min(d2,n);
            if(m1<m2){
                a-=Math.min(d1,n);
                b-=Math.min(d2,n-Math.min(d1,n));
            }
            else{
                b-=Math.min(d2,n);
                a-=Math.min(d1,n-Math.min(d2,n));
            }
            System.out.println(1L*a*b);
        }
    }
}
