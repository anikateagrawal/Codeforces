package easy_900;

import java.util.Scanner;

public class Game_With_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int min=Math.min(n,m);
        if(min%2==1) System.out.println("Akshat");
        else System.out.println("Malvika");
    }
}
