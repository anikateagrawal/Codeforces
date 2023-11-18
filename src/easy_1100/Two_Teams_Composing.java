package easy_1100;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Teams_Composing {
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
            int max=0;
            int u=m.size();
            for(int i:m.keySet()){
                int v=m.get(i);
                max=Math.max(max,Math.max(Math.min(u,v-1),Math.min(u-1,v)));
            }
            System.out.println(max);
        }
    }
}
