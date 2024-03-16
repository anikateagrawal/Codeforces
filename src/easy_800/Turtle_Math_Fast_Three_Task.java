package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Turtle_Math_Fast_Three_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            long ss=0;
            for(int i:a){
                s.add(i%3);
                ss+=i;
            }
            if(ss%3==0) System.out.println(0);
            else{
                long d=ss%3;
                if(s.contains((int)d)||d==2) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}
