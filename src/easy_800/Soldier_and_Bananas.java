package easy_800;

import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int s=w*(2*k+(w-1)*k)/2;
        if(s<=n)
        System.out.println(0);
        else System.out.println(s-n);
    }
}
