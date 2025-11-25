package easy_1200;

import java.util.Scanner;
import java.util.TreeMap;

public class Eugeny_and_Play_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        TreeMap<Long,Integer> map=new TreeMap<>();
        long d=0;
        for (int i=1;i<=n;i++){
            int c=sc.nextInt();
            int t=sc.nextInt();
            d+=c*t;
            map.put(d,i);
        }
        for (int i=0;i<m;i++){
            long v=sc.nextInt();
            System.out.println(map.ceilingEntry(v).getValue());
        }
    }
}
