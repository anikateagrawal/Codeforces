package easy_900;

import java.util.Scanner;

public class Prime_Subtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            if(x-y==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
