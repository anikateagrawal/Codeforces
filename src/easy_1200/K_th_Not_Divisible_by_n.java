package easy_1200;

import java.util.Scanner;

public class K_th_Not_Divisible_by_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int lo=0,hi=Integer.MAX_VALUE;
            int ans=-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                int nd=mid-mid/n;
                if(nd>=k){
                    ans=mid;
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            System.out.println(ans);
        }
    }
}
