package contests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UnforgivableCurse_hard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            if(fun(s1,s2,k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(String s1,String s2,int k){
        int n=s1.length();
        Map<Character,Integer> m1=new HashMap<>(),m2=new HashMap<>();
        for (int i = 0; i < n; i++) {
            m1.put(s1.charAt(i),m1.getOrDefault(s1.charAt(i),0)+1);
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1);
        }
        for (char i='a';i<='z';i++){
            if (m1.get(i)!= m2.get(i))return false;
        }
        for (int i = 0; i < Math.min(n,k); i++) {
            if (n-1-i<k){
                if(s1.charAt(i)!=s2.charAt(i))return false;
            }
        }
        return true;
    }
}
