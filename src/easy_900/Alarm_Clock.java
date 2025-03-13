package easy_900;

import java.util.Scanner;

public class Alarm_Clock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b<a){
                long tm=b;
                a-=b;
                if(c<=d) System.out.println(-1);
                else {
                    long diff=c-d;
                    long times=(a+diff-1)/diff;
                    tm+=c*times;
                    System.out.println(tm);
                }
            }
            else {
                System.out.println(b);
            }
        }
    }
}
