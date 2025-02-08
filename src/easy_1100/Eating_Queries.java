package easy_1100;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Eating_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int c[]=new int[n];
            for (int i=0;i<n;i++)c[i]=sc.nextInt();
            Arrays.sort(c);
            TreeMap<Long,Integer> map=new TreeMap<>();
            long sum=0;
            for (int i=n-1;i>=0;i--){
                sum+=c[i];
                map.put(sum,n-i);
            }
            while (q-->0){
                long x=sc.nextLong();
                Long k=map.ceilingKey(x);
                if(k==null) System.out.println(-1);
                else System.out.println(map.get(k));
            }
        }
    }
}
