package easy_900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_Cloning_Technique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            int max=0;
            for (int i:a){
                m.put(i,m.getOrDefault(i,0)+1);
                max=Math.max(max,m.get(i));
            }
            int op=0;
            int fr=max;
            while (fr<n){
                fr*=2;
                op++;
            }
            System.out.println(op+n-max);
        }
    }
}
