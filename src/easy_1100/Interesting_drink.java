package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Interesting_drink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int m=sc.nextInt();
        for (int i = 0; i < m; i++) {
            int c=sc.nextInt();
            System.out.println(search(a,c));
        }
    }
    static int search(int a[],int c){
        int lo=0,hi=a.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]<=c){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans+1;
    }
}
