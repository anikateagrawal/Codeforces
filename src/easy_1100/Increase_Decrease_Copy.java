package easy_1100;

import java.util.Scanner;

public class Increase_Decrease_Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int b[]=new int[n+1];
            for (int i=0;i<=n;i++)b[i]=sc.nextInt();
            long ans=0;
            long d=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                ans+=Math.abs(a[i]-b[i]);
                d=Math.min(d,Math.min(Math.abs(b[n]-a[i]),Math.abs(b[n]-b[i])));
                if(b[n]>=a[i]&&b[n]<=b[i] || b[n]>=b[i] && b[n]<=a[i])d=0;
            }
            System.out.println(ans+d+1);

        }
    }
}
