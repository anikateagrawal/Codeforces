package easy_800;

import java.util.Scanner;

public class Turtle_Puzzle_Rearrange_and_Negate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=0;
            for(int i=0;i<n;i++)s+=Math.abs(sc.nextInt());
            System.out.println(s);
        }
    }
}
