package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Counting_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long x=sc.nextInt();
            long y=sc.nextInt();
            int a[]=new int[n];
            long tot=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tot+=a[i];
            }
            Arrays.sort(a);
            long ans=0;
            for (int i=0;i<n;i++){
                long r=tot-a[i];
                long min=r-y;
                long max=r-x;
                int a1=search(a,i+1,a.length-1,min);
                int a2=search(a,i+1,a.length-1,max+1);
                ans+=a1-a2;
            }
            System.out.println(ans);
        }
    }
    static int search(int a[],int l, int h, long num){
        int ans=a.length;
        while (l<=h){
            int mid=l+(h-l)/2;
            if (a[mid]>=num){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return a.length-ans;
    }
}
