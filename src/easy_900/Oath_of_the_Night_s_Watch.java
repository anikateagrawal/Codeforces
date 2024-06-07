package easy_900;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Oath_of_the_Night_s_Watch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeMap<Integer,Integer> s=new TreeMap<>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            s.put(a,s.getOrDefault(a,0)+1);
        }
        int ans=0;
        if(s.size()>2){
            ans=n-s.get(s.firstKey())-s.get(s.lastKey());
        }
        System.out.println(ans);
    }
}
