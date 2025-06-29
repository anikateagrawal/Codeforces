package easy_1200;

import java.util.*;
public class Binary_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            HashMap<Integer,Integer> hm=new HashMap<>();
            hm.put(0,-1);int sum=0;int ans=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                sum+=num;
                if(hm.containsKey(sum-s)){
                    ans=Math.max(ans,i-hm.get(sum-s));
                }
                if(!hm.containsKey(sum))hm.put(sum,i);
            }
            if(s>sum) System.out.println(-1);
            else  System.out.println(n-ans);
        }
    }
}
