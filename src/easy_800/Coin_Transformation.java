package easy_800;

import java.util.Scanner;

public class Coin_Transformation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long c=1;
            while (n>3){
                c=2*c;
                n/=4;
            }
            System.out.println(c);
        }
    }
}
