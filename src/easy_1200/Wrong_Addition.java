package easy_1200;

import java.util.Scanner;

public class Wrong_Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long s=sc.nextLong();
            long mul=1;
            long b=0;
            boolean fl=true;
            while (a>0){
                long d=a%10;
                long d2=s%10;
                if (d>d2){
                    d2=s%100;
                    s/=10;
                }
                s/=10;
                long d1=d2-d;
                if (d1>9 || d1<0){
                    fl=false;
                    break;
                }
                b=d1*mul+b;
                mul*=10;
                a/=10;
            }
            if (s>0){
                b=s*mul+b;
            }
            if (fl) System.out.println(b);
            else System.out.println(-1);
        }
    }
}
