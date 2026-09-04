package easy_1100;

import java.util.Scanner;

public class Array_Recovery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int d[]=new int[n];
            for (int i=0;i<n;i++)d[i]=sc.nextInt();
            int a[]=new int[n];
            a[0]=d[0];
            boolean p=false;
            for (int i=1;i<n;i++){
                if (d[i]==0){
                    a[i]=a[i-1];
                    continue;
                }
                if(a[i-1]-d[i]>=0){
                    p=true;
                    break;
                }
                else a[i]=a[i-1]+d[i];
            }
            if (p) System.out.println(-1);
            else {
                for (int i:a) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
