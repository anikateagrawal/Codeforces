package easy_800;

import java.util.Scanner;

public class Shortest_Increasing_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>x) System.out.println(2);
            else if (y==1 ||x-y<2) System.out.println(-1);
            else System.out.println(3);
        }
    }
}
