package hard_1900;

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<int[]>> g=new ArrayList<>();
        for(int i=0;i<n;i++)g.add(new ArrayList<>());
        for(int i=0;i<m;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            int w=sc.nextInt();
            g.get(a).add(new int[]{b,w});
            g.get(b).add(new int[]{a,w});
        }
        PriorityQueue<long[]> q=new PriorityQueue<long[]>(Comparator.comparingLong(a -> a[1]));
        q.add(new long[]{0,0});
        long d[]=new long[n];
        Arrays.fill(d,Long.MAX_VALUE);
        int an[]=new int[n];
        Arrays.fill(an,-1);
        d[0]=0;
        while(!q.isEmpty()){
            long f[]=q.poll();
            int u=(int)f[0];
            long dis=f[1];
            for(int nb[]:g.get(u)){
                if(d[nb[0]]>d[u]+nb[1]){
                    d[nb[0]]=d[u]+nb[1];
                    an[nb[0]]=u;
                    q.add(new long[]{nb[0],d[u]+nb[1]});
                }
            }
        }
        if(d[n-1]==Long.MAX_VALUE)
        System.out.println(-1);
        else {
            List<Integer> l=new ArrayList<>();
            n=n-1;
            while(an[n]!=-1){
                l.add(n+1);
                n=an[n];
            }
            l.add(1);
            for(int i=l.size()-1;i>=0;i--) System.out.print(l.get(i)+" ");
            System.out.println();
        }
    }
}
