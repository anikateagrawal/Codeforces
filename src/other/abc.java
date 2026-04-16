package other;

import java.util.*;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for (int i=0;i<n;i++)a[i]=sc.nextLong();
        long gcd=a[0];
        for (int i=1;i<n;i++){
            gcd=greatestCommonDivisor(gcd,a[i]);
        }
        int count=0;
        for (int i=1;i<=Math.sqrt(gcd);i++){
            if (gcd%i==0){
                count++;
                long f=gcd/i;
                if (f!=i)count++;
            }
        }
        System.out.println(count);
    }
    static long greatestCommonDivisor(long dividend,long divisor){
        if (divisor==0)return dividend;
        return greatestCommonDivisor(divisor, dividend % divisor);
    }
}
