package div3;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Kolya {
    public static class multiset{
        public TreeMap<Integer,Integer> map;
        public int size=0;
        public multiset(){
            map=new TreeMap<>();
        }
        public multiset(int[] a){
            map=new TreeMap<>();
            size=a.length;
            for(int i=0;i<a.length;i++){
                map.put(a[i], map.getOrDefault(a[i], 0)+1);
            }
        }
        void add(int a){
            size++;
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        void remove(int a){
            size--;
            int val=map.get(a);
            map.put(a, val-1);
            if(val==1)map.remove(a);
        }
        void removeAll(int a){
            if(map.containsKey(a))
            {
                size-=map.get(a);
                map.remove(a);
            }
        }
        int ceiling(int a){
            if (map.ceilingKey(a) != null) {
                int find = map.ceilingKey(a);
                return find;
            }else return Integer.MIN_VALUE;
        }
        int floor(int a){
            if (map.floorKey(a) != null) {
                int find = map.floorKey(a);
                return find;
            }else return Integer.MAX_VALUE;
        }
        int lower(int a){
            if (map.lowerKey(a) != null) {
                int find = map.lowerKey(a);
                return find;
            }else return Integer.MAX_VALUE;
        }
        int higher(int a){
            if (map.higherKey(a) != null) {
                int find = map.higherKey(a);
                return find;
            }else return Integer.MIN_VALUE;
        }
        int first(){
            return map.firstKey();
        }
        int last(){
            return map.lastKey();
        }
        boolean contains(int a){
            if(map.containsKey(a))return true;
            return false;
        }
        int size(){
            return size;
        }
        void clear(){
            map.clear();
        }
        int poll(){
            if(map.size()==0){
                return Integer.MAX_VALUE;
            }
            size--;
            int first=map.firstKey();
            if(map.get(first)==1){
                map.pollFirstEntry();
            }else map.put(first, map.get(first)-1);
            return first;
        }
        int polllast(){
            if(map.size()==0){
                return Integer.MAX_VALUE;
            }
            size--;
            int last=map.lastKey();
            if(map.get(last)==1){
                map.pollLastEntry();
            }else map.put(last, map.get(last)-1);
            return last;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            multiset mt = new multiset();
            long sum=0;
            long ans=Long.MIN_VALUE;

            for (int i=0;i<n;i++){
                if(a[i]<=0)continue;
                sum+=a[i];
                mt.add(a[i]);
                if(mt.size()>m){
                    sum-=mt.first();
                    mt.remove(mt.first());
                }
                ans=Math.max(sum-1L*(i+1)*d,ans);
            }
            System.out.println(Math.max(ans,0L));
        }
    }
}
