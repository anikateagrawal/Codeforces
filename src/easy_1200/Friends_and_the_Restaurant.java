package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Friends_and_the_Restaurant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++)a[i]=sc.nextInt()-a[i];
            Arrays.sort(a);
            int i=0,j=n-1;
            int ans=0;
            while (i<j){
                if(a[i]+a[j]<0){
                    i++;
                    continue;
                }
                ans++;
                i++;j--;
            }
            System.out.println(ans);
        }
    }
}
