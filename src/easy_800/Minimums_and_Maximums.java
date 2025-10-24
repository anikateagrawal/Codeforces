package easy_800;

import java.util.Scanner;

public class Minimums_and_Maximums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l1=sc.nextInt();
            int r1=sc.nextInt();
            int l2=sc.nextInt();
            int r2=sc.nextInt();
            int max=Math.max(l1,l2);
            int min=Math.min(r1,r2);
            if(min-max>=0) System.out.println(max);
            else System.out.println(l1+l2);
        }
    }
}
