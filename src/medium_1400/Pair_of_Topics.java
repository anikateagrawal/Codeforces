package medium_1400;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Topics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        for (int i=0;i<n;i++)b[i]=sc.nextInt();
        int d[]=new int[n];
        for (int i=0;i<n;i++)d[i]=a[i]-b[i];
        Arrays.sort(d);
        long p=0;
        for (int i=0;i<n;i++){
            int diff=a[i]-b[i];
            int req=-1*diff+1;
            p+=bin(d,req);
            if(diff>=req)p--;
//            System.out.println(req+" "+p);
        }
//        System.out.println(Arrays.toString(d));
        System.out.println(p/2);
    }
    static int bin(int d[],int v){
        int n=d.length;
        int lo=0,hi=n-1;
        int ans=0;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(d[mid]>=v){
                ans=(n-mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}
