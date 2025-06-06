package medium_1400;

import java.util.Scanner;

public class Fadi_and_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long ansa=1,ansb=x;
        for (long i=1;i*i<=x;i++){
            if(x%i==0){
                long lcm=i*(x/i)/gcd(i,x/i);
                if(lcm==x){
                    ansa=i;
                    ansb=x/i;
                }
            }
        }
        System.out.println(ansa+" "+ansb);
    }
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
