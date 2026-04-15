package medium_1300;

import java.util.Scanner;

public class Common_Divisors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for (int i=0;i<n;i++)a[i]=sc.nextLong();
        long gcd=a[0];
        for (int i=1;i<n;i++){
            gcd=gcd(gcd,a[i]);
        }
        int d=0;
        for (long i=1;i*i<=gcd;i++){
            if (gcd%i==0){
                d++;
                if (gcd/i!=i)d++;
            }
        }
        System.out.println(d);
    }
    static long gcd(long a,long b){
        if (b==0)return a;
        return gcd(b,a%b);
    }
}
