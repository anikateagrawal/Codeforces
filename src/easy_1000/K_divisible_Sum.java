package easy_1000;

import java.util.Scanner;

public class K_divisible_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==1){
                System.out.println(k);
                continue;
            }
            int lo=1,hi=Integer.MAX_VALUE;
            int ans=-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(check(n,k,mid)){
                    ans=mid;
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            System.out.println(ans);
        }
    }
    static boolean check(int n,int k,int a){
        long min=1L*a+(n-1)-1;
        long max=1L*a*n;
        return max/k-min/k>0;
    }
}
