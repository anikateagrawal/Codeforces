package div3;

import java.util.*;

public class Sum_and_Product {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            long a[]=new long[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextLong();
            }
            int q=s.nextInt();
            HashMap<Long,Long> map=new HashMap<>();
            for(Long i:a)
            {
                map.put(i,map.getOrDefault(i,(long)0)+1);
            }
            long ans[]=new long[q];
            int in=0;
            while(q-->0)
            {
                long x=s.nextLong();
                long y=s.nextLong();
                if(x*x>=4*y)
                {
                    if(((int)Math.abs(x))%2==(sqrt(x*x-4*y))%2)
                    {
                        long p=x+sqrt(x*x-4*y);
                        long ne=x-sqrt(x*x-4*y);
                        p=p/2;
                        ne=ne/2;
                        if(map.containsKey(p))
                        {
                            if(map.containsKey(x-p))
                            {
                                if(p*(x-p)==y&&x-p!=p)
                                    ans[in]+=map.get(p)*map.get(x-p);
                                else if(x-p==p)
                                    ans[in]+=(map.get(p)*(map.get(p)-1))/2;
                            }
                        }
                        if(map.containsKey(ne)&&ne!=x-p)
                        {
                            if(map.containsKey(x-ne))
                            {
                                if(ne*(x-ne)==y&&x-ne!=ne)
                                    ans[in]+=map.get(ne)*map.get(x-ne);
                                else if(x-ne==ne)
                                    ans[in]+=(map.get(ne)*(map.get(ne)-1))/2;
                            }
                        }
                        in+=1;
                    }
                    else
                    {
                        ans[in++]=0;
                    }
                }
                else
                {
                    ans[in++]=0;
                }
            }
            for(int i=0;i<ans.length;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
        System.out.println(sb);
    }
    public static long sqrt(long x)
    {
        long l=0;
        long h=(long)(3e9);
        long ans=0;
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            if(mid*mid<=x)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return ans;
    }
}
