package easy_1000;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Monsters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            PriorityQueue<int[]> pq=new PriorityQueue<>((i1,i2)->i1[0]==i2[0]?i1[1]-i2[1]:i2[0]-i1[0]);
            for (int i=0;i<n;i++){
                int a[]=new int[]{sc.nextInt()%k,i};
                if(a[0]==0)a[0]=k;
                pq.add(a);
            }
            while (!pq.isEmpty()){
                System.out.print(pq.poll()[1]+1+" ");
            }
            System.out.println();
        }
    }
}
