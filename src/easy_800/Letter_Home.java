package easy_800;

import java.util.Scanner;

public class Letter_Home {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int min=Math.min(Math.abs(s-a[0]),Math.abs(s-a[n-1]));
            int ans=a[n-1]-a[0]+min;
            System.out.println(ans);
        }
    }
}
