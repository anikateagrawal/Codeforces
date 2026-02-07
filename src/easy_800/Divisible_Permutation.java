package easy_800;

import java.util.Scanner;

public class Divisible_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int v=1;
            for (int i=n-1;i>=0;i-=2)a[i]=v++;
            v=n;
            for (int i=n-2;i>=0;i-=2)a[i]=v--;
            for (int i:a) System.out.print(i+" ");
            System.out.println();
        }
    }
}
