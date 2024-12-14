package easy_1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gold_Rush {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Map<String,Boolean> dp=new HashMap<>();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(check(n,m,dp)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    static boolean check(int n,int m,Map<String ,Boolean> dp){
        if(m==n) return true;
        if(m>n||n%3!=0)return false;
        String key=""+n+" "+m;
        if(dp.containsKey(key))return dp.get(key);
        boolean ans=false;
        ans|=check(n/3,m,dp);
        ans|=check(n/3*2,m,dp);
        dp.put(key,ans);
        return ans;
    }
}
