package easy_800;

import java.util.*;

public class Garland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Map<Character,Integer> s=new HashMap<>();
            String a=sc.next();
            for (char ch:a.toCharArray()){
                s.put(ch,s.getOrDefault(ch,0)+1);
            }
            if(s.size()==1) System.out.println(-1);
            else if(s.size()==2) {
                if(s.get(a.charAt(0))==1||s.get(a.charAt(0))==3)
                System.out.println(6);
                else System.out.println(4);
            }
            else System.out.println(4);
        }
    }
}
