package easy_1000;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Valerii_Against_Everyone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int b[]=new int[n];
            Set<Integer> s=new HashSet<>();
            for (int i=0;i<n;i++){
                b[i]=sc.nextInt();
                s.add(b[i]);
            }
            if(s.size()<n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
