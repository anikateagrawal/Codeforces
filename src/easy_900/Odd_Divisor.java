package easy_900;

import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n==0||(n&(n-1))==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
