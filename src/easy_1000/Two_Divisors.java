package easy_1000;

import java.util.Scanner;

public class Two_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int gcd=gcd(a,b);
            int lcm=a/gcd*b;
            if(lcm==b){
                lcm*=b/a;
            }
            System.out.println(lcm);
        }
    }
    static  int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
