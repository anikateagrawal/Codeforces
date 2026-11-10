package easy_800;

import java.util.Scanner;

public class Array_and_Peaks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p = (n+1)/2 -1;
            if(k>p) System.out.println(-1);
            else {
                int a[]=new int[n];
                for (int i=0;i<n;i++)a[i]=i+1;
                int in=1;
                for (int i=0;i<k;i++){
                    int tmp=a[in+1];
                    a[in+1]=a[in];
                    a[in]=tmp;
                    in+=2;
                }
                for (int i:a) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
