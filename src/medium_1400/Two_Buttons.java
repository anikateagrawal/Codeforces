package medium_1400;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Two_Buttons {
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int vis[]=new int[100001];
        Queue<Integer> q=new LinkedList<>();
        Arrays.fill(vis,-1);
        vis[n]=0;
        q.add(n);
        while (!q.isEmpty()){
            int f=q.poll();
            if(f==m)break;
            for(int i:new int[]{f-1,f*2}){
                if(i>=0&&i<=100000&&vis[i]==-1){
                    vis[i]=vis[f]+1;
                    q.add(i);
                }
            }
        }
        System.out.println(vis[m]);
    }
}
