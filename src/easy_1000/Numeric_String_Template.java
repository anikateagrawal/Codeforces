package easy_1000;

import java.util.*;

public class Numeric_String_Template {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int m=sc.nextInt();
            while (m-->0){
                String s=sc.next();
                Map<Character,Integer> map=new HashMap<>();
                Set<Integer> st=new HashSet<>();
                boolean flag=true;
                if(s.length()!=n){
                    System.out.println("NO");
                    continue;
                }
                for (int i=0;i<n;i++){
                    char ch=s.charAt(i);
                    if(map.containsKey(ch)){
                        if(map.get(ch)!=a[i]){
                            flag=false;
                            break;
                        }
                    }
                    else{
                        if(st.contains(a[i])){
                            flag=false;break;
                        }
                        else {
                            map.put(ch,a[i]);
                            st.add(a[i]);
                        }
                    }
                }
                if(flag) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
