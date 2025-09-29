package easy_800;

import java.util.Scanner;

public class Compote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt()/2;
        int c=sc.nextInt()/4;
        int min=Math.min(a,Math.min(b,c));
        System.out.println(min*7);
    }
}
