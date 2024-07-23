package easy_800;

import java.util.Scanner;

public class The_Miracle_and_the_Sleeper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int lo=l,hi=r;
            int ans=r%l;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                int mod=2*mid-1;
                if(mod>=l&&mod<=r){
                    ans=Math.max(ans,mid-1);
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            System.out.println(ans);
        }
    }
}
