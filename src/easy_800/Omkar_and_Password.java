package easy_800;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Omkar_and_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            Map<Integer,Integer> m=new HashMap<>();
            int max=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
            if(m.size()>1) System.out.println(1);
            else System.out.println(n);
        }
    }
}
