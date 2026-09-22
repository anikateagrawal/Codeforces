package easy_800;

import java.util.Scanner;

public class Palindrome_Twelve_and_Two_Terms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if (n%12==10) {
                if (n>=22) System.out.println(22+" "+(n-22));
                else System.out.println(-1);
            }
            else {
                long a=n%12;
                long b=n-a;
                System.out.println(a+" "+b);
            }
        }
    }
}
