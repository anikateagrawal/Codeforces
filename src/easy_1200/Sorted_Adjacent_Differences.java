package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Adjacent_Differences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ans[]=new int[n];
            int i=0,j=n-1;
            int in=n-1;
            while (i<j){
                ans[in--]=a[i++];
                ans[in--]=a[j--];
            }
            if(i==j)ans[in--]=a[i++];
            for (int k:ans) System.out.print(k+" ");
            System.out.println();
        }
    }
}
