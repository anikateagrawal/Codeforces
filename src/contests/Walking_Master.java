package contests;

import java.util.Scanner;

public class Walking_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long c=sc.nextInt();
            long d=sc.nextInt();
            System.out.println(fun(a,b,c,d));
        }
    }
    public  static long fun(long a,long b,long c,long d){
        long y=d-b;
        if(y<0)return -1;
        long x=c-a;
        d-=y;
        c-=y;
        if(c>a)return -1;
        return y+a-c;

    }
}
