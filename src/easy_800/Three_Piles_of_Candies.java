package easy_800;

import java.util.Scanner;

public class Three_Piles_of_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong()+a+b;
            System.out.println(c/2);
        }
    }
}
