package easy_800;

import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            for (int i=0;i<n;i++)a[sc.nextInt()]++;
            int s=0;
            for (int i=0;i<=n;i++){
                s+=a[i]/2;
            }
            System.out.println(s);
        }
    }
}
