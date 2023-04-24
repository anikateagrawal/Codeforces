package div3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gardening_Friends {
    static List<List<Integer>> g;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int c=sc.nextInt();
            g=new ArrayList<>();
            long h[]=new long[n];
            for(int i=0;i<n;i++)g.add(new ArrayList<>());
            for(int i=0;i<n-1;i++){
                int a=sc.nextInt()-1;
                int b=sc.nextInt()-1;
                g.get(a).add(b);
                g.get(b).add(a);
            }
            dfs(0,-1,h);
            long h2[]= Arrays.copyOf(h,n);
            long max=h[0];
            int mi=0;

            for(int i=0;i<n;i++){
                if(h[i]>max){
                    max=h[i];
                    mi=i;
                }
            }
            Arrays.fill(h,0);
            dfs(mi,-1,h);
            long ans=0;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,h[i]*k-h2[i]*c);
            }

            System.out.println(ans);
        }
    }
    static  void dfs(int r,int p,long h[]){
        for(int c:g.get(r)){
            if(c!=p){
                h[c]=h[r]+1;
                dfs(c,r,h);
            }
        }
    }
}
