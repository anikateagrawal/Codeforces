package easy_900;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Serval_and_String_Theory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            String rev=new StringBuilder(s).reverse().toString();
            Set<Character> st=new HashSet<>();
            for (char ch:s.toCharArray())st.add(ch);
            if (k==0){
                if (s.compareTo(rev)<0) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if (st.size()>1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
