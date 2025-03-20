package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class The_Third_Side {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i=0;i<n;i++)pq.add(sc.nextInt());
            while (pq.size()>1){
                int a=pq.poll();
                int b=pq.poll();
                pq.add(a+b-1);
            }
            System.out.println(pq.poll());
        }
    }
}
