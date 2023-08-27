package easy_800;

import java.util.Scanner;

public class Mahmoud_and_Ehab_and_the_even_odd_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1) System.out.println("Ehab");
        else System.out.println("Mahmoud");
    }
}
