package easy_1000;

import java.util.*;

public class Notepad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Map<String,Integer> m =new HashMap<>();
            boolean ans=false;
            for (int i=0;i<s.length()-1;i++){
                String sub=s.substring(i,i+2);
                if(m.containsKey(sub)){
                    int in=m.get(sub);
                    if(i-in>1){
                        ans=true;
                        break;
                    }
                }
                else m.put(sub,i);
            }
            if(ans) System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
