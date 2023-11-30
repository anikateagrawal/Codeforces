package easy_800;

import java.util.Scanner;

public class Combination_Lock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1=sc.next();
        String s2=sc.next();
        int m=0;
        for(int i=0;i<n;i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            int d=Math.abs(c1-c2);
            int d2=10-d;
            m+=Math.min(d,d2);
        }
        System.out.println(m);
    }
}
