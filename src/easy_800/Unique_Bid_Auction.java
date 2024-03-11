package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unique_Bid_Auction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            Map<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
            int ans=-1,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(m.get(a[i])==1){
                    if(a[i]<min){
                        min=a[i];
                        ans=i+1;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
