package hard_1900;

import java.util.*;

public class MST {
    static TreeSet<Integer> arr[];
    static TreeSet<Integer> set=new TreeSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        arr=new TreeSet[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new TreeSet<>();
        }
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 0; i < n; i++) {
            set.add(i);
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            if(set.remove(i)){
                ans++;
                dfs(i);
            }
        }
        System.out.println(ans-1);
    }
    private static void dfs(int x) {
        List<Integer> ll=new ArrayList<>();
        for(int i:set){
            if(!arr[x].contains(i)){
                ll.add(i);
            }
        }
        for(int i:ll){
            set.remove(i);
        }
        for(int i:ll){
            dfs(i);
        }
    }
}
