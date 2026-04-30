package easy_1100;

import java.util.Scanner;

public class Kill_Demodogs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long mod=(long)(1e9+7);
        while (t-->0){
            long n=sc.nextInt();
            long sum_sq=n*(n+1)%mod*(2*n+1)%mod;
            long sum_oth=2*n*(n-1)%mod*(n+1)%mod;
            long ans=(sum_sq+sum_oth)%mod*2022/6%mod;
            System.out.println(ans);
        }
    }
}
