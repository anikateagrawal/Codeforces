package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diverse_Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            m.put(a,i+1);
        }
        if(m.size()<k) System.out.println("NO");
        else{
            System.out.println("YES");
            for(int i:m.keySet()){
                System.out.print(m.get(i)+" ");
                k--;
                if(k==0)break;
            }
            System.out.println();
        }
    }
}
