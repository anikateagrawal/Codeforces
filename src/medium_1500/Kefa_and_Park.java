package medium_1500;

import java.util.*;

public class Kefa_and_Park {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Map<Integer, List<Integer>> g=new HashMap<>();
        for (int i = 0; i < n; i++) {
            g.put(i,new ArrayList<>());
        }
        for(int i=0;i<n-1;i++){
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            g.get(x).add(y);
        }
        System.out.println(dfs(g,0,m,0,a));
    }
    static int dfs(Map<Integer,List<Integer>> g,int src,int m,int c,int a[]){
        if(a[src]==1)c++;
        else c=0;
        if(c>m)return 0;
        if(g.get(src).size()==0)return 1;
        int res=0;
        for(int nb:g.get(src)){
            res+=dfs(g,nb,m,c,a);
        }
        return res;
    }
}
