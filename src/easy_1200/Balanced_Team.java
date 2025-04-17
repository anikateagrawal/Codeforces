package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int i=0,j=0,ans=0;
        while (i<n&&j<n){
            while (j<n&&a[j]-a[i]<=5)j++;
            ans=Math.max(ans,j-i);
            i++;
        }
        System.out.println(ans);
    }
}
