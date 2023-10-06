package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                m.put(a,m.getOrDefault(a,0)+1);
            }
            for (int k:m.keySet()){
                if(m.get(k)>=3){
                    System.out.println(k);
                    continue outer;
                }
            }
            System.out.println(-1);
        }
    }
}
