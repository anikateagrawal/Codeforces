package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

public class Startup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            TreeMap<Integer,Long> m=new TreeMap<>();
            for (int i=0;i<k;i++){
                int b=sc.nextInt();
                int c=sc.nextInt();
                m.put(b,m.getOrDefault(b,0L)+c);
            }
            long sum=0;
            List<Map.Entry<Integer,Long>> l=new ArrayList<>(m.entrySet());
            Collections.sort(l,(i1,i2)->(int)(i2.getValue()-i1.getValue()));
            for (int i=0;i<Math.min(n,l.size());i++){
                sum+=l.get(i).getValue();
            }
            System.out.println(sum);
        }
    }
}
