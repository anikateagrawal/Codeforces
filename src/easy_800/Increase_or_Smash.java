package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Increase_or_Smash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s.add(a[i]);
            }
            System.out.println(s.size()*2-1);
        }
    }
}
