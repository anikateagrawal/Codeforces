package easy_800;

import java.util.Scanner;

public class Blackboard_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%4==0) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
