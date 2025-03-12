package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Draw_a_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<4;i++)s.add(sc.nextInt());
            if(s.size()==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
