package easy_1200;

import java.util.Scanner;

public class Worms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        a[0]=sc.nextInt();
        for (int i = 1; i < n; i++) {
            a[i]= sc.nextInt()+a[i-1];
        }
        int m=sc.nextInt();
        while (m-->0){
            int q=sc.nextInt();
            int lo=0,hi=n-1;
            int ans=-1;
            while (lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(a[mid]>=q){
                    ans=mid;
                    hi=mid-1;
                }
                else lo=mid+1;
            }
            System.out.println(ans+1);
        }
    }
}
