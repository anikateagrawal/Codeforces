package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Recycling_Center {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>((i1,i2)->i2-i1);
            for (int i:a)pq.add(i);
            int m=1;
            int ans=0;
            while (!pq.isEmpty()){
                while (!pq.isEmpty()&& pq.peek()*m>c){
                    ans++;
                    pq.poll();
                }
                pq.poll();
                m*=2;
            }
            System.out.println(ans);
        }
    }
}
