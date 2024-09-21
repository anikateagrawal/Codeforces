package easy_800;

import java.util.Scanner;

public class Longest_Good_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int diff=r-l;
            int lo=0,hi=diff;
            int ans=-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(1L*mid*(mid+1)/2<=diff){
                    ans=mid;
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            System.out.println(ans+1);
        }
    }
}
