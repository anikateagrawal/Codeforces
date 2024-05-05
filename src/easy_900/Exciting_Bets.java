package easy_900;

import java.util.Scanner;

public class Exciting_Bets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==b) System.out.println("0 0");
            else{
                long d=Math.abs(a-b);
                long m=Math.min(a%d,d-a%d);
                System.out.println(d+ " "+m);
            }
        }
    }
}
