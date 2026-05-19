package easy_1100;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Train_and_Queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,Integer> f=new HashMap<>();
            Map<Integer,Integer> l=new HashMap<>();
            for (int i=0;i<n;i++){
                int u=sc.nextInt();
                if (!f.containsKey(u))f.put(u,i);
                l.put(u,i);
            }
            while (k-->0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if (!f.containsKey(a) || !l.containsKey(b) || f.get(a)>l.get(b)) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
