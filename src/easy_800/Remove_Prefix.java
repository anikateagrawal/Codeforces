package easy_800;

import java.util.*;
import java.util.Scanner;

public class Remove_Prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            int l=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(!m.containsKey(a)){
                    m.put(a,i);
                }
                else {
                    l=Math.max(l,m.get(a)+1);
                    m.put(a,i);
                }
            }
            System.out.println(l);

        }
    }
}
