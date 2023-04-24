package div3;

import java.util.*;
import java.io.*;
public class Magic_Triples {
    static long bb=10000000;
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            sol(n,a);
        }
    }
    static void rev(int a[]){
        int i=0,j=a.length-1;
        while(i<j){
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
            i++;j--;
        }
    }
    static void sol(int n,int a[]){
        Arrays.sort(a);
        rev(a);
        Map<Long,Long> m=new HashMap<>();
        Map<Long,Long> m2=new HashMap<>();
        long ans=0;
        for (int i = 0; i < n; i++) {
            m.put(a[i]*1L,m.getOrDefault(a[i]*1L,0L)+1);
        }
        List<Map.Entry<Long,Long>> l=new ArrayList<>(m.entrySet());
        for(int i=l.size()-1;i>=0;i--){
            Map.Entry<Long,Long> e=l.get(i);
            for(long j=2;j<=1000;j++){
                if(j*e.getKey()>1e6)break;
                if(m.containsKey(e.getKey()*j)){
                    m2.put(e.getKey()*bb+j,m2.getOrDefault(e.getKey()*bb+j,0L)+m.get(e.getKey()*j)*e.getValue());
                    if(m2.containsKey(e.getKey()*j*bb+j)){
                        ans+=m2.get(e.getKey()*j*bb+j)*e.getValue();
                    }
                }
            }
            ans+=e.getValue()*(e.getValue()-1)*(e.getValue()-2);
        }
        System.out.println(ans);

    }
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

}
