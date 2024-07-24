package easy_1200;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Even_Odd_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
            for (int i=0;i<n;i++){
                pq.add(sc.nextInt());
            }
            int c=0;
            long s1=0,s2=0;
            while (!pq.isEmpty()){
                int f=pq.poll();
                if(c%2==f%2){
                    if(c%2==0)s1+=f;
                    else s2+=f;
                }
                c++;
            }
            if(s1>s2) System.out.println("Alice");
            else if(s2>s1) System.out.println("Bob");
            else System.out.println("Tie");
        }
    }
}
