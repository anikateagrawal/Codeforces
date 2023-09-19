package easy_1200;

import java.util.HashMap;
import java.util.Scanner;

public class Same_Differences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            HashMap<Integer, Integer> map=new HashMap<>();
            long res=0;
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt()-i;
                int a=map.getOrDefault(x,0);
                res+=a;
                map.put(x,a+1);
            }
            System.out.println(res);
        }
    }
}
