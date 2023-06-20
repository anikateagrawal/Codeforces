package medium_1300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registration_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(m.containsKey(s)){
                int c=m.get(s);
                c++;
                System.out.println(s+c);
                m.put(s,c);
            }
            else {
                System.out.println("OK");
                m.put(s,0);
            }
        }
    }
}
