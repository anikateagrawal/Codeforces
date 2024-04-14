package easy_900;

import java.util.Scanner;

public class PizzaForces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if(n<=6) System.out.println(15);
            else System.out.println((n+n%2)/2*5);
        }
    }
}
