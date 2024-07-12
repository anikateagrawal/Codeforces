package easy_800;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Only_Pluses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for (int i=0;i<3;i++)q.add(sc.nextInt());
            for (int i=0;i<5;i++){
                int f=q.poll();
                q.add(f+1);
            }
            int p=1;
            while (!q.isEmpty())p*=q.poll();
            System.out.println(p);

        }
    }
}
