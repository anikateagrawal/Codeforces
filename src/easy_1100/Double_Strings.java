package easy_1100;

import java.util.*;

public class Double_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<String> l=new ArrayList<>();
            Set<String> s=new HashSet<>();
            for (int i=0;i<n;i++){
                String str=sc.next();
                l.add(str);
                s.add(str);
            }
            String ans="";
            outer:
            for (String str:l){
                for (int i=1;i<str.length();i++){
                    String sub=str.substring(0,i);
                    String sub2=str.substring(i);
                    if(s.contains(sub) && s.contains(sub2)){
                        ans+="1";
                        continue outer;
                    }
                }
                ans+="0";
            }
            System.out.println(ans);
        }
    }
}
