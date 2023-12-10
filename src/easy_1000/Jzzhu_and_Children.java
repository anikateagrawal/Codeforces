package easy_1000;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Jzzhu_and_Children {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        Queue<int[]> q=new LinkedList<>();
        for (int i=0;i<n;i++){
            q.add(new int[]{i,sc.nextInt()});
        }
        while(q.size()>1){
            int f[]=q.poll();
            f[1]-=m;
            if(f[1]<=0)continue;
            q.add(f);
        }
        System.out.println(q.peek()[0]+1);
    }
}
