package easy_1000;

import java.util.*;

public class Shoe_Shuffling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            TreeMap<Integer,List<Integer>> m=new TreeMap<>();
            for (int i=0;i<n;i++){
                m.computeIfAbsent(a[i],k->new ArrayList<>()).add(i+1);
            }
            for (int k:m.keySet()){
                List<Integer> v=m.get(k);
                if(v.size()==1){
                    System.out.println(-1);
                    continue outer;
                }
                Collections.rotate(v,1);
            }
            for (int k:m.keySet()){
                List<Integer> v=m.get(k);
                for (int i:v) System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
