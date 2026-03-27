package easy_1200;

import java.util.Scanner;
import java.util.TreeMap;

public class Stone_Age_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        TreeMap<Integer,Integer> m=new TreeMap<>();
        long sum=0;
        for (int i=0;i<n;i++){
            m.put(i,sc.nextInt());
            sum+=m.get(i);
        }
        while (q-->0){
            int t=sc.nextInt();
            if (t==1){
                int i=sc.nextInt()-1;
                int x=sc.nextInt();
                if(m.containsKey(i)) sum-=m.get(i);
                else sum-=m.get(-1);
                sum+=x;
                m.put(i,x);
                System.out.println(sum);
            }
            else {
                int x=sc.nextInt();
                m.clear();
                m.put(-1,x);
                sum=1L*n*x;
                System.out.println(sum);
            }
        }
    }
}
