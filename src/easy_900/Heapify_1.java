package easy_900;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Heapify_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean vis[]=new boolean[n];
            for (int i=0;i<n/2;i++){
                if(vis[i])continue;
                PriorityQueue<Integer> pq=new PriorityQueue<>();
                for (int j=i;j<n;j=2*j+1){
                    pq.add(a[j]);
                    vis[j]=true;
                }
                for (int j=i;j<n;j=2*j+1){
                    a[j]=pq.poll();
                    vis[j]=true;
                }
            }
            boolean fl=true;
            for (int i=0;i<n-1;i++){
                if (a[i+1]<a[i])fl=false;
            }
            if (fl) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
