package easy_1000;

import java.util.*;

public class Koxia_and_Whiteboards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for (int i=0;i<n;i++)q.add(sc.nextInt());
            while (m-->0){
                q.poll();
                q.add(sc.nextInt());
            }
            long s=0;
            while (!q.isEmpty())s+=q.poll();
            System.out.println(s);
        }
    }
}
