package easy_800;

import java.util.Scanner;

public class Treasure_Hunt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int r=a%(x+y);
            if (r<x) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
