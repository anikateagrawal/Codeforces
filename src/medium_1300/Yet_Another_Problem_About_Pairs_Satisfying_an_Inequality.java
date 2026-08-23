package medium_1300;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yet_Another_Problem_About_Pairs_Satisfying_an_Inequality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            List<int[]> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                if (a[i]<=i)l.add(new int[]{a[i],i+1});
            }
            long ans=0;
            for (int i[]:l){
                ans+=search(l,i[0]);
            }
            System.out.println(ans);
        }
    }
    static int search(List<int[]> l, int v){
        int lo=0,hi=l.size()-1;
        int ans=0;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(l.get(mid)[1]<v){
                ans=mid+1;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
}
