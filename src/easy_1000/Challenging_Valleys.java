package easy_1000;

import java.util.Scanner;

public class Challenging_Valleys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int i=0;
            while (i<n-1 && a[i]>=a[i+1])i++;
            while (i<n-1 && a[i]<=a[i+1])i++;
            if(i==n-1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
