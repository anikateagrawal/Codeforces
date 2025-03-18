package easy_1100;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            long v=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='L'){
                    v+=i;
                    pq.add(n-2*i-1);
                }
                else {
                    v+=n-i-1;
                    pq.add(2*i-n+1);
                }
            }
            for (int i=0;i<n;i++){
                int f=pq.poll();
                if(f>0)v+=f;
                System.out.print(v+" ");
            }
            System.out.println();

        }
    }
}
