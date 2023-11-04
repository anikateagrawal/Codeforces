package medium_1300;

import java.util.Scanner;

public class Random_Teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long m=sc.nextInt();
        long max=n-m+1;
        long max2=max*(max-1)/2;
        long r=n%m;
        long  d=n/m;
        long p1=d+1;
        long min=r*(p1*(p1-1)/2)+(m-r)*d*(d-1)/2;
        System.out.println(min+" "+max2);
    }
}
