package easy_1200;

import java.util.*;

public class Districts_Connection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,List<Integer>> m=new HashMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                m.computeIfAbsent(a,k->new ArrayList<>()).add(i+1);
            }
            if (m.size()==1) System.out.println("NO");
            else {
                System.out.println("YES");
                List<List<Integer>> l=new ArrayList<>(m.values());
                int sr=l.get(0).get(0);
                for (int i=1;i<l.size();i++){
                    for (int d:l.get(i)){
                        System.out.println(sr+" "+d);
                    }
                }
                sr=l.get(1).get(0);
                for (int i=1;i<l.get(0).size();i++){
                    System.out.println(sr+" "+l.get(0).get(i));
                }
            }
        }
    }
}
