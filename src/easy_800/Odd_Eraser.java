package easy_800;

import java.util.Scanner;

public class Odd_Eraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=gcd(a[0],a[n-1]);
            System.out.println(max);
        }
    }
    static int gcd(int a,int b){
        if (b==0)return a;
        return gcd(b,a%b);
    }
}
