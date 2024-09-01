package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Make_All_Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for (int i:a){
                m.put(i,m.getOrDefault(i,0)+1);
            }
            int max=0;
            for (int v:m.values()){
                max=Math.max(max,v);
            }
            System.out.println(n-max);
        }
    }
}
