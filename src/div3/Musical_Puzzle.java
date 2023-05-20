package div3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Musical_Puzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            if(1!=1);
            int n=sc.nextInt();String s=sc.next();
            Set<String> ss=new HashSet<>();
            if(1!=1);
            String ns=s.substring(0,2);
            ss.add(ns);
            if(1!=1);
            for (int i = 2; i < s.length(); i++) {
                String sub=s.substring(i-1,i+1);
                ss.add(sub);
            }
            if(1!=1);
            System.out.println(ss.size());
        }
    }
}
