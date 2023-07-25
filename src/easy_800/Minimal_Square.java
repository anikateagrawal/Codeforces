package easy_800;

import java.util.Scanner;

public class Minimal_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int s=Math.max(min*2,max);
            System.out.println(s*s);
        }
    }
}
