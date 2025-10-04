package easy_1100;

import java.util.Scanner;

public class Cardboard_for_Pictures {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long lo=1,hi=Integer.MAX_VALUE;
            while (lo<=hi){
                long mid=lo+(hi-lo)/2;
                long ans=fun(a,mid,c);
                if(ans==c){
                    System.out.println(mid);
                    break;
                }
                else if(ans>c){
                    hi=mid-1;
                }
                else lo=mid+1;
            }
        }
    }
    static long fun(int a[],long w, long c){
        long ans=0;
        for (int i:a){
            ans+=(i+2*w)*(i+2*w);
            if(ans>c)return Long.MAX_VALUE;
        }
        return ans;
    }
}
