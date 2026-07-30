package easy_800;

import java.util.Scanner;

public class Permutation_Chain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=1;i<=n;i++)a[i-1]=i;
            System.out.println(n);
            for (int i=0;i<n;i++){
                for (int j:a) System.out.print(j+" ");
                System.out.println();
                if (i+1<n){
                    int tmp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=tmp;
                }
            }
        }
    }
}
