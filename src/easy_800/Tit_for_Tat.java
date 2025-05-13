package easy_800;

import java.util.Scanner;

public class Tit_for_Tat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++){
                int min=Math.min(a[i],k);
                a[i]-=min;
                sum+=min;
                k-=min;
                if(k==0)break;
            }
            a[n-1]+=sum;
            for (int i:a) System.out.print(i+" ");
            System.out.println();
        }
    }
}
