package easy_1000;

import java.util.Scanner;

public class Replace_and_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n];
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            a[n-1]=Math.max(a[n-1],b[n-1]);
            for (int i=n-2;i>=0;i--){
                a[i]=Math.max(a[i],Math.max(b[i],a[i+1]));
            }
            int cs[]=new int[n+1];
            for (int i=1;i<=n;i++){
                cs[i]+=cs[i-1]+a[i-1];
            }
            for (int i=0;i<q;i++){
                int l=sc.nextInt();int r=sc.nextInt();
                System.out.print(cs[r]-cs[l-1]+" ");
            }
            System.out.println();
        }
    }
}
