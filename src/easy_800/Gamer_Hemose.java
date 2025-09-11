package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Gamer_Hemose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int s=a[n-1]+a[n-2];
            int ans=h/s*2;
            h=h%s;
            if(h>a[n-1])ans+=2;
            else if (h>0)ans++;
            System.out.println(ans);
        }
    }
}
