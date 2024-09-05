package easy_800;

import java.util.Scanner;
import java.util.Stack;

public class osu_mania {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Stack<Integer> s=new Stack<>();
            for (int i=0;i<n;i++){
                String ss=sc.next();
                s.add(ss.indexOf('#')+1);
            }
            while (!s.isEmpty()) System.out.print(s.pop()+" ");
            System.out.println();
        }
    }
}
