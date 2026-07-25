package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Convergence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]= sc.nextInt();
            Arrays.sort(a);
            int i=0,j=n-1;
            int l=a[n/2];
            int ans=0;
            while (i<j){
                if (a[i]==l && a[j]==l)break;
                ans++;
                i++;j--;
            }
            System.out.println(ans);
        }
    }
}
