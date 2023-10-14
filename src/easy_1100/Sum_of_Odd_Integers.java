package easy_1100;

import java.util.Scanner;

public class Sum_of_Odd_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            long k=sc.nextInt();
            long s=k*(2+(k-1)*2)/2;
            if(n%2==k%2&&n>=s) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
