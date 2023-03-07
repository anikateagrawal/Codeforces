package contests;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Powering_the_Hero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            PriorityQueue<Integer> q=new PriorityQueue<>((y,z)->z-y);
            long s=0;
            for (int i = 0; i < n; i++) {
                if(a[i]==0){
                    if (!q.isEmpty())
                        s+=q.poll();
                }
                else q.add(a[i]);
            }
            System.out.println(s);
        }
    }
}
