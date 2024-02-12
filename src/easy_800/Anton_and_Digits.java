package easy_800;

import java.util.Scanner;

public class Anton_and_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k2=sc.nextInt();
        int k3=sc.nextInt();
        int k5=sc.nextInt();
        int k6=sc.nextInt();
        int min=Math.min(k2,Math.min(k5,k6));
        int r=k2-min;
        int min2=Math.min(r,k3);
        System.out.println(256*min+32*min2);
    }
}
