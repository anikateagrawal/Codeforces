package easy_800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regular_Bracket_Sequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<String> ans=generateParenthesis(n);
            for (int i=0;i<n;i++) System.out.println(ans.get(i));
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        fun(n,0,0,"",l);
        return l;
    }
    static void fun(int n, int o, int c, String s,List<String> l){
        if (l.size()==n)return;
        if(s.length()== 2*n){
            l.add(s);
            return;
        }
        if(c<o) fun(n,o,c+1, s+")", l);
        if(o<n) fun(n,o+1,c , s+"(", l);
    }
}
