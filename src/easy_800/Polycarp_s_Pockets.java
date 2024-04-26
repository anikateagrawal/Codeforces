package easy_800;

import java.util.Scanner;

public class Polycarp_s_Pockets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[101];
        int max=0;
        while (n-->0){
            int b=sc.nextInt();
            a[b]++;
            max=Math.max(max,a[b]);
        }
        System.out.println(max);
    }
}
