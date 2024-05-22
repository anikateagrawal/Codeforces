package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Queries_about_less_or_equal_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        for (int i=0;i<m;i++){
            System.out.print(find(a,sc.nextInt())+" ");
        }
    }
    public static int find(int a[],int v){
        int lo=0,hi=a.length-1;
        int ans=0;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]<=v){
                ans=mid+1;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;

    }

}
