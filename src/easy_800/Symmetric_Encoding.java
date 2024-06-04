package easy_800;

import java.util.*;

public class Symmetric_Encoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Set<Character> st=new HashSet<>();
            for (char ch:s.toCharArray())st.add(ch);
            List<Character> l=new ArrayList<>(st);
            Collections.sort(l);
            Map<Character,Integer> m=new HashMap<>();
            for (int i=0;i<l.size();i++){
                m.put(l.get(i),i);
            }
            String d="";
            for (char ch:s.toCharArray()){
                d+=l.get(l.size()-1-m.get(ch));
            }
            System.out.println(d);
        }
    }
}
