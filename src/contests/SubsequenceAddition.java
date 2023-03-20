package contests;

import java.util.Arrays;
import java.util.Scanner;

public class SubsequenceAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            fun(a,n);
        }
    }
    public static void fun(int a[],int n){
        Arrays.sort(a);
        long sum=1;
        if(a[0]!=1) {
            System.out.println("NO");return;
        }
        for (int i = 1; i < n; i++) {
            if(a[i]<=sum){
                sum+=a[i];continue;
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
