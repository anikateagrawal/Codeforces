package easy_1000;

import java.util.Scanner;
import java.util.TreeMap;

public class Letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        TreeMap<Long,Integer> map=new TreeMap<>();
        map.put(0L,0);
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=sc.nextLong();
            map.put(sum,i+1);
        }
        while (m-->0){
            long r=sc.nextLong();
            long fl=map.floorKey(r);
            if(r==fl) System.out.println(map.get(fl)+" "+(r-map.floorKey(fl-1)));
            else
            System.out.println(map.get(fl)+1+" "+(r-fl));
        }
    }
}
