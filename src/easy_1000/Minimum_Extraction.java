package easy_1000;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Extraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i=0;i<n;i++){
                pq.add(sc.nextInt());
            }
            int sum=0;
            int max=pq.peek();
            while (pq.size()>1){
                sum=pq.poll();
                max=Math.max(max,pq.peek()-sum);
            }
            System.out.println(max);
        }
    }
}
