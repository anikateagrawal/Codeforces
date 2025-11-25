package easy_1100;

import java.util.Scanner;

public class GCD_Length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int z=(int)Math.pow(10,c-1);
            z=nextPrime(z);
            int x= (int) Math.ceil(Math.pow(10,a-1)/z);
            int y=(int)Math.ceil(Math.pow(10,b-1)/z);
            x=nextPrime(x);
            y=nextPrime(y);
            if(x==y)y=nextPrime(y+1);
            System.out.println((z*x)+" "+(z*y));
        }
    }
    static int nextPrime(int n){
        while (!isPrime(n))n++;
        return n;
    }
    static boolean isPrime(int n){
        if(n<=1)return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
