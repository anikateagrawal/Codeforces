package easy_800;

import java.util.Scanner;

public class Zhan_s_Blender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int min=Math.min(x,y);
            int time=(n+min-1)/min;
            System.out.println(time);
        }
    }
}
