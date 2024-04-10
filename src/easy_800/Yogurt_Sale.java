package easy_800;

import java.util.Scanner;

public class Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int am=Math.min(2*a,b)*(n/2)+n%2*a;
            System.out.println(am);
        }
    }
}
