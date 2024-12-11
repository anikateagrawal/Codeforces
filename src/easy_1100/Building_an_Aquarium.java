package easy_1100;

import java.util.Map;
import java.util.Scanner;

public class Building_an_Aquarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int lo=0,hi=Integer.MAX_VALUE;
            int ans=-1;
            while (lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(isPossible(a,mid,x)){
                    ans=mid;
                    lo=mid+1;
                }
                else hi=mid-1;
            }
            System.out.println(ans);
        }
    }
    static boolean isPossible(int a[],int h,int x){
        long s=0;
        for (int i=0;i<a.length;i++){
            s+= Math.max(h-a[i],0);
        }
        return s<=x;
    }
}
