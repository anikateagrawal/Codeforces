package easy_900;

import java.util.Scanner;

public class Longest_Divisors_Interval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            int i;
            for (i=1;n%i==0;i++);
            System.out.println(i-1);
        }
    }
}
