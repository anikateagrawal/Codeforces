package easy_900;

import java.util.*;

public class Following_the_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            List<Queue<Character>> l=new ArrayList<>();
            StringBuilder ans=new StringBuilder("");
            Queue<Character> ini=new LinkedList<>();
            for(int i=0;i<26;i++){
                ini.add((char)('a'+i));
            }
            l.add(ini);
            for(int i=0;i<n;i++){
                Queue<Character> c=l.get(a[i]);
                if(a[i]+1==l.size())l.add(new LinkedList<>());
                char ch=c.poll();
                ans.append(ch);
                l.get(a[i]+1).add(ch);
            }
            System.out.println(ans.toString());
        }
    }
}
