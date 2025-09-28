package easy_1100;

import java.util.Scanner;

public class Sort_the_Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)b[i]=sc.nextInt();
            int f=-1,l=-1;
            for (int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    if(f==-1)f=i;
                    l=i;
                }
            }
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i=f;i<=l;i++){
                min=Math.min(a[i],min);
                max=Math.max(a[i],max);
            }
            while(f>0 && a[f-1]<=min){
                min=a[f-1];
                f--;
            }
            while (l<n-1 && a[l+1]>=max){
                max=a[l+1];
                l++;
            }
            l++;
            f++;
            System.out.println(f+" "+l);
        }
    }
}
