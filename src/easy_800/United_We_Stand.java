package easy_800;

import java.util.Scanner;
import java.util.TreeMap;

public class United_We_Stand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            TreeMap<Integer,Integer> m=new TreeMap<>();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                a[i]=v;
                m.put(v,m.getOrDefault(v,0)+1);
            }
            if(m.size()==1) System.out.println(-1);
            else {
                int c=m.lastKey();
                int cl=m.get(c);
                System.out.println((n-cl)+" "+cl);
                for (int i=0;i<n;i++){
                    if(a[i]==c)continue;
                    else System.out.print(a[i]+" ");
                }
                System.out.println();
                for (int i=0;i<cl;i++) System.out.print(c+" ");
                System.out.println();
            }

        }
    }
}
