package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_Minus_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long x=sc.nextInt();
            long y=sc.nextInt();
            long lcm=(x*y)/gcd(x,y);
            long ln=n/lcm;
            long xn=n-(n/x-ln);
            long yn=n/y-ln;
//            System.out.println(xn+" "+yn+" "+lcm+" "+ln);
            long ans=1L*n*(n+1)/2-xn*(xn+1)/2 - yn*(yn+1)/2;
            System.out.println(ans);
        }
    }
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
