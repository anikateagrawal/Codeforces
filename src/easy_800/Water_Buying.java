package easy_800;

import java.util.Scanner;

public class Water_Buying {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while (q-->0){
            long n=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();
            long min=Math.min(2*a,b);
            long cost=n/2*min + (n%2)*a;
            System.out.println(cost);
        }
    }
}
