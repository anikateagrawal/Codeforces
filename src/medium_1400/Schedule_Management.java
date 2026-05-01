package medium_1400;

import java.util.Scanner;

public class Schedule_Management {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[m];
            for (int i=0;i<m;i++)a[i]=sc.nextInt();
            int f[]=new int[n];
            for (int i:a)f[i-1]++;
            int lo=1,hi=2*m;
            int ans=-1;
            while (lo<=hi){
                int mid=lo+(hi-lo)/2;
                if (valid(f,mid,m)){
                    ans=mid;
                    hi=mid-1;
                }
                else lo=mid+1;
//                System.out.println(mid+" "+ans);
            }
            System.out.println(ans);
        }
    }
    static boolean valid(int f[],int h,int n){
        int t=0;
        for (int i:f){
            if (i>=h){
                t+=h;
            }
            else {
                t+=i+(h-i)/2;
            }
            if (t>=n)return true;
        }
        return false;
    }
}
