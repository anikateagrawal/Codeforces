package easy_900;

import java.util.Scanner;

public class Left_and_Down {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            long gcd=gcd(a,b);
            long max=Math.max(a/gcd,b/gcd);
            if(max>k) System.out.println(2);
            else System.out.println(1);
        }
    }
    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
