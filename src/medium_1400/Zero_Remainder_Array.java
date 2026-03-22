package medium_1400;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zero_Remainder_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=(k-sc.nextInt()%k)%k;
            }
            Map<Integer,Integer> m=new HashMap<>();
            int mf=0,mr=0;
            for (int i:a){
                if(i==0)continue;
                m.put(i,m.getOrDefault(i,0)+1);
                if(m.get(i)>mf){
                    mf=m.get(i);
                    mr=i;
                }
                else if (m.get(i)==mf && i>mr){
                    mr=i;
                }
            }
            if (m.size()==0){
                System.out.println(0);
                continue;
            }
            long ans=(mf-1L)*k+(mr+1);
            System.out.println(ans);
        }
    }
}
