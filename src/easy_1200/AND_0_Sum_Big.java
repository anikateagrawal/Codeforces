package easy_1200;

import java.util.Scanner;

public class AND_0_Sum_Big {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int mod=1000000007;
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long ans=1;
            while (k-->0){
                ans=(ans*n)%mod;
            }
            System.out.println(ans);
        }
    }
}
