package medium_1500;

import java.util.*;

public class Winner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        int v[]=new int[n];
        for (int i=0;i<n;i++){
            s[i]=sc.next();
            v[i]=sc.nextInt();
        }
        Map<String,Integer> m=new HashMap<>();
        for (int i=0;i<n;i++){
            m.put(s[i],m.getOrDefault(s[i],0)+v[i]);
        }
        int max=0;
        for (int i:m.values()){
            max=Math.max(max,i);
        }
        Set<String> p=new HashSet<>();
        for (String k:m.keySet()){
            if(m.get(k)==max)p.add(k);
        }
        Map<String,Integer> m2=new HashMap<>();
        for (int i=0;i<n;i++){
            if(!p.contains(s[i]))continue;
            m2.put(s[i],m2.getOrDefault(s[i],0)+v[i]);
            if(m2.get(s[i])>=max){
                System.out.println(s[i]);
                break;
            }
        }
    }
}
