package easy_900;

import java.util.Scanner;

public class Battle_for_Survive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();

            long l=a[n-2];
            for (int i=n-3;i>=0;i--){
                l-=a[i];
            }
            System.out.println(a[n-1]-l);
        }
    }
}
