package medium_1600;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long mod=998244353;
        long a[]=new long[n];
        long b[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=(sc.nextLong()*(i+1))*(n-i);
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long sum=0;
        for(int i=0;i<n;i++){
            sum=(sum+((a[i]%mod)*b[n-i-1])%mod)%mod;
        }
        System.out.println(sum);
    }
}
