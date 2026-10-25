package easy_800;

import java.util.Scanner;

public class Exponential_Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if (n % 2==1) System.out.println(-1);
            else System.out.println(1+" "+(n/2));
        }
    }
}
