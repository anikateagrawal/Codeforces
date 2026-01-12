package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Carnival_Wheel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int max=0;
            Set<Integer> s=new HashSet<>();
            while (!s.contains((a+b)%l)){
                a=(a+b)%l;
                max=Math.max(max,a);
                s.add(a);
            }
            System.out.println(max);
        }
    }
}
