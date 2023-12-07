package easy_800;

import java.util.Scanner;

public class Food_for_Animals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=c-Math.max(x-a,0)-Math.max(y-b,0);
            if(r<0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
