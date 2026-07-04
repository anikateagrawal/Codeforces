package easy_1100;

import java.util.Scanner;

public class Counterexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        if (l%2==1)l++;
        if (r-l<2 ) System.out.println(-1);
        else System.out.println(l+" "+(l+1)+" "+(l+2));
    }
}
