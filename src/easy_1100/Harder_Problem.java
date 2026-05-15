package easy_1100;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Harder_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++)s.add(i+1);
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                int v=sc.nextInt();
                if (s.contains(v)){
                    a[i]=v;
                    s.remove(v);
                }
            }
            int i=0;
            for (int v:s){
                while (a[i]!=0)i++;
                a[i]=v;
            }
            for (int v:a) System.out.print(v+" ");
            System.out.println();
        }
    }
}
