package div3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Kolya_and_Movie_Theatre {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Map<Long,Long> dp=new HashMap<>();
            System.out.println(fun(a,m,d,0,-1,dp));
        }
    }
    static long fun(int a[],int m,int d,int i,int p,Map<Long,Long> dp){
        if(m==0||i==a.length)return 0L;
        long k=m*1000000+p;
        if(dp.containsKey(k))return dp.get(k);
        long exc=fun(a,m,d,i+1,p,dp);
        long inc=a[i]-d*(i-p)+fun(a,m-1,d,i+1,i,dp);
        long max=Math.max(inc,exc);
        dp.put(k,max);
        return max;
    }
}
