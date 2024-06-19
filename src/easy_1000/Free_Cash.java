package easy_1000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Free_Cash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        Map<String,Integer> m=new HashMap<>();
        for (int i=0;i<n;i++){
            String s=sc.next()+" "+sc.next();
            m.put(s,m.getOrDefault(s,0)+1);
        }
        for(int v:m.values()){
            c=Math.max(c,v);
        }
        System.out.println(c);

    }
}
