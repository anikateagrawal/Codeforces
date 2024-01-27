package easy_800;

import java.util.*;

public class Word_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<String> a=new HashSet<>();
            Set<String> b=new HashSet<>();
            Set<String> c=new HashSet<>();
            Map<String,Integer> m=new HashMap<>();
            for (int i=0;i<n;i++)a.add(sc.next());
            for (int i=0;i<n;i++)b.add(sc.next());
            for (int i=0;i<n;i++)c.add(sc.next());
            int s[]=new int[3];
            for(String ss:a){
                if(b.contains(ss)&&c.contains(ss))continue;
                else if(b.contains(ss)||c.contains(ss))s[0]++;
                else s[0]+=3;
            }
            for(String ss:b){
                if(a.contains(ss)&&c.contains(ss))continue;
                else if(a.contains(ss)||c.contains(ss))s[1]++;
                else s[1]+=3;
            }
            for(String ss:c){
                if(b.contains(ss)&&a.contains(ss))continue;
                else if(b.contains(ss)||a.contains(ss))s[2]++;
                else s[2]+=3;
            }
            for(int i=0;i<3;i++)
            System.out.print(s[i]+" ");
            System.out.println();

        }
    }
}
