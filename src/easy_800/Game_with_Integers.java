package easy_800;

import java.util.Scanner;

public class Game_with_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%3==0) System.out.println("Second");
            else System.out.println("First");
        }
    }
}
