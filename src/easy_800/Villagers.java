package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Villagers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            PriorityQueue<Integer> pq=new PriorityQueue<>((i1,i2)->i2-i1);
            for (int i=0;i<n;i++)pq.add(a[i]);
            long ans=0;
            while (pq.size()>1){
                int g1=pq.poll();
                int g2=pq.poll();
                ans+=Math.max(g1,g2);
                pq.add(0);
            }
            System.out.println(ans);
        }
    }
}
