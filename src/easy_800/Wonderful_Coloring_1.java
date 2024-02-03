package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Wonderful_Coloring_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            Set<Character> r=new HashSet<>();
            Set<Character> g=new HashSet<>();
            for(char ch:s.toCharArray()){
                if(r.contains(ch)&&g.contains(ch)){
                    continue;
                }
                else if(r.contains(ch))g.add(ch);
                else if(g.contains(ch)) r.add(ch);
                else {
                    if(r.size()>g.size())g.add(ch);
                    else r.add(ch);
                }
            }
            System.out.println(Math.min(r.size(),g.size())+(Math.abs(r.size()-g.size())/2));

        }
    }
}
