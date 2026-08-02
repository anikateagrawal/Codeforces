package easy_1000;

import java.util.Scanner;

public class Minimise_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            System.out.println(Math.min(a[0]*2,a[0]+a[1]));
        }
    }
}
