package medium_1300;

import java.util.*;

public class Divisible_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Map<Integer, List<Integer>> m=new HashMap<>();
            for (int i:a){
                int r=i%y;
                m.computeIfAbsent(r,k->new ArrayList<>()).add(i);
            }
            long ans=0;
            for (List<Integer> l:m.values()){
//                System.out.println(l+" "+countPairs(l,x));
                ans+=countPairs(l,x);
            }
            System.out.println(ans);
        }
    }
    public static long countPairs(List<Integer> l,int x){
        Map<Integer,Integer> m=new HashMap<>();
        long count=0;
        for (int i:l){
            int rem=i%x;
            int req=(x-rem)%x;
            count+=m.getOrDefault(req,0);
            m.put(rem,m.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
