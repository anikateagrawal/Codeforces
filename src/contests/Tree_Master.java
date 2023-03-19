package contests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tree_Master {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int w[]=new int[n+1];
        for (int i = 1; i <= n; i++) {
            w[i]= sc.nextInt();
        }
        int p[]=new int[n+1];
        p[1]=0;
        for (int i = 2; i <=n ; i++) {
            p[i]=sc.nextInt();
        }
        Map<String,Long> m=new HashMap<>();
        while (q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            long ans=fun(x,y,m,p,w);

            System.out.println(ans);
        }
    }
    public static long fun(int x,int y,Map<String,Long> m,int p[],int w[]){
        if(x==0||y==0){
            return 0;
        }
        int r[]=new int[]{x,y};
        String aa= Arrays.toString(r);
        if(m.containsKey(aa)){
//            System.out.println("svf");
            return m.get(aa);
        }
        long ans=fun(p[x],p[y],m,p,w)+1L*w[x]*w[y];
        m.put(aa,ans);
        return ans;
    }
}
