package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Fashionable_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int i=0;
            while (a[i]%2!=a[n-1]%2)i++;
            int j=n-1;
            while (a[0]%2!=a[j]%2)j--;
            int ans=Math.min(i,n-j-1);
            System.out.println(ans);
        }

    }
}
