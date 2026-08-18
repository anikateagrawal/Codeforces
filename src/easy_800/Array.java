package easy_800;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                int g=0,s=0;
                for (int j=i+1;j<n;j++){
                    if (a[j]>a[i])g++;
                    else if (a[j]<a[i])s++;
                }
                System.out.print(Math.max(g,s)+" ");
            }
            System.out.println();
        }
    }
}
