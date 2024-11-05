package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Colored_Balls_Revisited {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            PriorityQueue<int[]> pq =new PriorityQueue<>((i1,i2)->i1[0]-i2[0]);
            for (int i=0;i<n;i++)pq.add(new int[]{sc.nextInt(),i});
            while (pq.size()>1){
                int p1[]=pq.poll();
                int p2[]=pq.poll();
                if(p1[0]>1)pq.add(new int[]{p1[0]-1,p1[1]});
                if(p2[0]>1)pq.add(new int[]{p2[0]-1,p2[1]});
            }
            System.out.println(pq.poll()[1]+1);
        }
    }
}
