package easy_800;

import java.util.Scanner;

public class Puzzle_Pieces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==1||b==1) System.out.println("YES");
            else if(a==2&&b==2) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
