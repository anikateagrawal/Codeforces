package easy_1000;

import java.util.Scanner;

public class Array_merging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int c1[]=new int[2*n+1];
            int c2[]=new int[2*n+1];
            int c=0,p=0;
            for (int i=0;i<n;i++){
                if(a[i]==p)c++;
                else {
                    c1[p]=Math.max(c1[p],c);
                    c=1;p=a[i];
                }
            }
            c1[p]=Math.max(c1[p],c);
            c=0;p=0;
            for (int i=0;i<n;i++){
                if(b[i]==p)c++;
                else {
                    c2[p]=Math.max(c2[p],c);
                    c=1;p=b[i];
                }
            }
            c2[p]=Math.max(c2[p],c);
            int ans=0;
            for (int i=0;i<=2*n;i++){
                ans=Math.max(ans,c1[i]+c2[i]);
            }
            System.out.println(ans);
        }
    }
}
