package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Energy_Crystals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            pq.add(0);
            pq.add(0);
            pq.add(0);
            int op=0;
            while (pq.peek()<x){
                int f=pq.poll();
                pq.add(pq.peek()*2+1);
                op++;
            }
            System.out.println(op);
        }
    }
}
