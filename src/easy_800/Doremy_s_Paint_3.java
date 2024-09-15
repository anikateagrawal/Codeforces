package easy_800;

import java.util.*;

public class Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                m.put(a,m.getOrDefault(a,0)+1);
            }
            if(m.keySet().size()>2) System.out.println("NO");
            else if(m.keySet().size()==1) System.out.println("YES");
            else {
                List<Integer> values=new ArrayList<>(m.values());
                int first=values.get(0);
                int second=values.get(1);
                if(Math.abs(first-second)<=1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
