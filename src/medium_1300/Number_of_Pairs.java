package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int a[]=new int [n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            long c=0;
            for (int i=0;i<n-1;i++){
                int ub=upper_bound(a,i+1,n-1,r-a[i]);
                int lb=lower_bound(a,i+1,n-1,l-a[i]);
                c+=ub-lb+1;
//                System.out.println(ub+ " "+lb);
            }
            System.out.println(c);
        }
    }
    static int upper_bound(int a[],int lo,int hi,int r){
        int ans=lo-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]<=r){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
    static  int lower_bound(int a[],int lo,int hi,int l){
        int ans=hi+1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]>=l){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}
