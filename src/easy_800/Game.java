package easy_800;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        if(n1>n2) System.out.println("First");
        else System.out.println("Second");
    }
}
