package easy_800;

import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int x=sc.nextInt();
            System.out.println((int)(x*Math.pow(2,k)));
        }
    }
}
