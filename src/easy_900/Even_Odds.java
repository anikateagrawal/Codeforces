package easy_900;

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        if(k<=n/2+n%2){
            System.out.println(2*k-1);
        }
        else {
            k-=n/2+n%2;
            System.out.println(2*k);
        }
    }
}
