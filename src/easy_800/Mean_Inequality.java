package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Mean_Inequality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[2*n];
            for(int i=0;i<2*n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for (int i=0;i<n;i++) System.out.print(a[i]+" "+a[i+n]+" ");
            System.out.println();
        }
    }
}
