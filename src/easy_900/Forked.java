package easy_900;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Forked {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int xk=sc.nextInt();
            int yk=sc.nextInt();
            int xq=sc.nextInt();
            int yq=sc.nextInt();
            int dx=Math.abs(xk-xq);
            int dy=Math.abs(yk-yq);
            Set<Integer> s=new HashSet<>();
            s.add(a+b);
            s.add(Math.abs(a-b));
            s.add(2*a);
            s.add(2*b);
            if(dx==2*a && dy==2*b)System.out.println(1);
            else if(dx==2*b && dy==2*a)System.out.println(1);
            else if(dx==0 && (dy==2*a || dy==2*b)) System.out.println(2);
            else if(dy==0 && (dx==2*a || dx==2*b)) System.out.println(2);
            else if(s.contains(dx) && s.contains(dy)) System.out.println(2);
            else System.out.println(0);
        }
    }
}
