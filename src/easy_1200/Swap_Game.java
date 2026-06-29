package easy_1200;

import java.util.Scanner;

public class Swap_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int min=Integer.MAX_VALUE;
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]+=sc.nextInt();
                min=Math.min(min,a[i]);
            }
            if (min==a[0]) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
