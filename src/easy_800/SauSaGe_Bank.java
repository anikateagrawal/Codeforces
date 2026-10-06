package easy_800;

import java.util.Scanner;

public class SauSaGe_Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d = n - k + 1;
            int ans = (int)Math.pow(2,d) + (k-1) * 2;
            System.out.println(ans);
        }
    }
}
