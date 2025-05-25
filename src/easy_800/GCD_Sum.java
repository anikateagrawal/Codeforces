package easy_800;

import java.util.Scanner;

public class GCD_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            while (gcd(n,sumOfDigits(n))<=1)n++;
            System.out.println(n);
        }
    }
    static int sumOfDigits(long n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
