package easy_900;

import java.util.Scanner;

public class Mocha_and_Math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int an=a[0];
            for (int i=1;i<n;i++)an&=a[i];
            System.out.println(an);
        }
    }
}
