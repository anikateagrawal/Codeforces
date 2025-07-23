package easy_900;

import java.util.Scanner;

public class Chips_on_the_Board {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        long t=sc.nextInt();
        for(long i=0;i<t;i++) {
            long n=sc.nextInt();

            long k=0;
            long j=Long.MAX_VALUE;
            for(long l=0;l<n;l++) {
                long b=sc.nextInt();
                if(b<j) {
                    j=b;
                }
                k=k+b;
            }
            long x=0;
            long y=Long.MAX_VALUE;
            for(long l=0;l<n;l++) {
                long b=sc.nextInt();
                if(b<y) {
                    y=b;
                }
                x=x+b;
            }
            if((j*n+x)>(y*n+k)){
                System.out.println(y*n+k);
            }
            else {
                System.out.println(j*n+x);
            }
        }
    }
}
