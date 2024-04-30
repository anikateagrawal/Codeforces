package easy_800;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Number_Replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            String s=sc.next();
            Map<Integer,Character> m=new HashMap<>();
            boolean f=true;
            for (int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(m.containsKey(a[i])){
                    if(ch!=m.get(a[i])){
                        f=false;
                        break;
                    }
                }
                else m.put(a[i],ch);
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
