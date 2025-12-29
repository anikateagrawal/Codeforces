package easy_800;

import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int max=0;
            while (n>0){
                int d=n%10;
                max=Math.max(max,d);
                n/=10;
            }
            System.out.println(max);
        }
    }
}
