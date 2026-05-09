package easy_1100;

import java.util.Scanner;

public class Deja_Vu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int p=31;
            while (q-->0){
                int x=sc.nextInt();
                if (x<p){
                    p=x;
                    for (int i=0;i<n;i++){
                        if (a[i]%(1<<x)==0){
                            a[i]+=1<<(x-1);
                        }
                    }
                }
            }
            for (int i:a) System.out.print(i+" ");
            System.out.println();
        }
    }
}
