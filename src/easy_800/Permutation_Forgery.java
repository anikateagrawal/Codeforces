package easy_800;

import java.util.Scanner;

public class Permutation_Forgery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=n-1;i>=0;i--) System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
