package easy_1100;

import java.util.*;
public class Anya_and_1100
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            StringBuilder s=new StringBuilder(sc.next());
            int q=sc.nextInt();
            int n=s.length();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<=n-4;i++)
            {
                if(s.substring(i,i+4).equals("1100"))
                    set.add(i);
            }
            while(q-->0)
            {
                int i=sc.nextInt()-1;
                int v=sc.nextInt();
                if(s.charAt(i)!=(char)('0'+v))
                {
                    for(int j=Math.max(0,i-3);j<=Math.min(n-4,i);j++)
                    {
                        if(s.substring(j,j+4).equals("1100"))
                            set.remove(j);
                    }
                    s.setCharAt(i,(char)('0'+v));
                    for(int j=Math.max(0,i-3);j<=Math.min(n-4,i);j++)
                    {
                        if(s.substring(j,j+4).equals("1100"))
                            set.add(j);
                    }

                }
                System.out.println(set.isEmpty()?"NO" : "YES");
            }
        }
    }
}