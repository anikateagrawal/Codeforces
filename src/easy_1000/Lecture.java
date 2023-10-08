package easy_1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Map<String,String> g=new HashMap<>();
        for(int i=0;i<m;i++){
            String a=sc.next();
            String b=sc.next();
            g.put(a,b);
        }
        for(int i=0;i<n;i++){
            String a=sc.next();
            if(a.length()<=g.get(a).length()) System.out.print(a+" ");
            else System.out.print(g.get(a)+ " ");
        }
    }
}
