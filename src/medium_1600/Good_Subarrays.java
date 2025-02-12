package medium_1600;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Good_Subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            int sum=0;
            Map<Integer,Integer> m=new HashMap<>();
            m.put(0,1);
            for (int i=0;i<n;i++){
                int d=s.charAt(i)-'0';
                sum+=d;
                int x=sum-i-1;
                ans+=m.getOrDefault(x,0);
                m.put(x,m.getOrDefault(x,0)+1);
            }
            System.out.println(ans);
        }
    }
}
