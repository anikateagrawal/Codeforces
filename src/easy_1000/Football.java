package easy_1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> m=new HashMap<>();
        int n=sc.nextInt();
        int mx=0;String ms="";
        for(int i=0;i<n;i++){
            String s=sc.next();
            m.put(s,m.getOrDefault(s,0)+1);
            if(m.get(s)>mx){
                mx=m.get(s);
                ms=s;
            }
        }
        System.out.println(ms);
    }
}
