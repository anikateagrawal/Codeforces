package easy_1100;

import java.util.Arrays;
import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int g[]=new int[4];
        for(int i:a){
            g[i-1]++;
        }
        int t=g[3];
        int min31=Math.min(g[2],g[0]);
        t+=min31;
        g[2]-=min31;
        g[0]-=min31;
        t+=g[2];
        int r=g[1]*2+g[0];
        t+=(int)Math.ceil(r/4.0);
        System.out.println(t);
    }
}
