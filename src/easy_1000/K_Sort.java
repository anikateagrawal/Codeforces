package easy_1000;

import java.util.Scanner;

public class K_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long ans=0;
            int max=0;
            int in=0;
            for (int i=0;i<n;i++){
                if (a[i]>max){
                    max=a[i];
                    continue;
                }
                int d=max-a[i];
                ans+=d;
                in=Math.max(d,in);
            }
            ans+=in;
            System.out.println(ans);
        }
    }
}
