package easy_1000;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Reduce_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:a)pq.add(i);
        while(pq.size()>1){
            int a1=pq.poll();
            int a2=pq.poll();
            sum+=a1+a2;
            pq.add(a1+a2);
        }
        System.out.println(sum);
    }
}
