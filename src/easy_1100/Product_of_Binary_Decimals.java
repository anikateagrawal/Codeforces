package easy_1100;

import java.util.Scanner;

public class Product_of_Binary_Decimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=64;i>=2;i--){
                String s=Integer.toBinaryString(i);
                int d=Integer.parseInt(s);
                while (n%d==0){
                    n/=d;
                }
//                System.out.println(n+" "+d);
            }
            if (n==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
