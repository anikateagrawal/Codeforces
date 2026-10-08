package easy_800;

import java.util.Scanner;

public class Bulbs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean f[]=new boolean[m+1];
        for (int i=0;i<n;i++){
            int x=sc.nextInt();
            for (int j=0;j<x;j++){
                f[sc.nextInt()]=true;
            }
        }
        boolean fl=true;
        for (int i=1;i<=m;i++){
            if (f[i]==false)fl=false;
        }
        if (fl) System.out.println("YES");
        else System.out.println("NO");
    }
}
