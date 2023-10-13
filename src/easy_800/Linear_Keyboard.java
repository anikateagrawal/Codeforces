package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Linear_Keyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            Map<Character,Integer> m=new HashMap<>();
            for(int i=0;i<s.length();i++){
                m.put(s.charAt(i),i);
            }
            String s2=sc.next();
            int p=m.get(s2.charAt(0));
            int d=0;
            for(int i=1;i<s2.length();i++){
                int p2=m.get(s2.charAt(i));
                d+=Math.abs(p2-p);
                p=p2;
            }
            System.out.println(d);
        }
    }
}
