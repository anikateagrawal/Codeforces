package easy_800;

import java.util.Scanner;

public class Wallet_Exchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();int b=sc.nextInt();
            if((0L+a+b)%2==0) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
