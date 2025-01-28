package easy_800;

import java.util.Scanner;

public class Maximums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int x=0;
        for (int i=0;i<n;i++){
            int b=sc.nextInt();
            a[i]=b+x;
            x=Math.max(x,a[i]);
        }
        for (int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
