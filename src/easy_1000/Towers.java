package easy_1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            PriorityQueue<int[]> pq=new PriorityQueue<>((i1,i2)->i1[0]-i2[0]);
            for (int i=0;i<n;i++) {
                pq.add(new int[]{sc.nextInt(),1});
            }
            int ans=1;
            int max=1;
            while (pq.size()>1) {
                int x[]=pq.poll();
                if(x[0]==pq.peek()[0]) {
                    int y[]=pq.poll();
                    int th=x[1]+y[1];
                    max=Math.max(max,th);
                    pq.add(new int[]{2*x[0],th});
                }
                else {
                    ans++;
                }
            }
            System.out.println(max+" "+ans);

    }
}
