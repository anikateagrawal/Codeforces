package hard_1900;

import java.util.*;
public class MST_0_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<TreeSet<Integer>> map=new ArrayList<>();
        for(int i=0;i<n;i++)map.add(new TreeSet<>());
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            map.get(a).add(b);
            map.get(b).add(a);
        }
        TreeSet<Integer> uv=new TreeSet<>();
        for (int i = 0; i <n ; i++) {
            uv.add(i);
        }
        int ans=-1;
        while(uv.size()>0){
            int f=uv.first();
            uv.remove(f);
            ans++;
            dfs(uv,map,f);
        }
        System.out.println(ans);
    }

    private static void dfs(TreeSet<Integer> uv, List<TreeSet<Integer>> map, int f) {
        Integer j=-1;
        while((j=uv.higher(j))!=null){
            if(!map.get(f).contains(j)){
                uv.remove(j);
                dfs(uv,map,j);
            }
        }
    }

}
