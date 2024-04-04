package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Polycarp_Writes_a_String_from_Memory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            Set<Character> st=new HashSet<>();
            int d=1;
            for (char ch:s.toCharArray()){
                if(st.size()<3){
                    st.add(ch);continue;
                }
                if(st.contains(ch))continue;
                st=new HashSet<>();
                st.add(ch);
                d++;
            }
            System.out.println(d);
        }
    }
}
