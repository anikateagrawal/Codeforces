package easy_900;

import java.util.Scanner;

public class Make_it_Divisible_by_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            int steps=make_00_50(n);
            steps=Math.min(steps,make_25_75(n));
            System.out.println(steps);
        }
    }
    static int make_00_50(long n){
        int steps=0;
        while (n%10!=0){
            steps++;
            n/=10;
        }
        n/=10;
        while (n%10!=0&&n%10!=5){
            steps++;
            n/=10;
        }
        return steps;
    }
    static int make_25_75(long n){
        int steps=0;
        while (n%10!=5){
            steps++;
            n/=10;
            if(n==0)return Integer.MAX_VALUE;
        }
        n/=10;
        while (n%10!=2&&n%10!=7){
            steps++;
            n/=10;
            if(n==0)return Integer.MAX_VALUE;
        }
        return steps;
    }
}
