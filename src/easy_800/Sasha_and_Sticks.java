package easy_800;

import java.util.Scanner;

public class Sasha_and_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long d=n/k;
        if(d%2==0) System.out.println("NO");
        else System.out.println("YES");
    }
}
