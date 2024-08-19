package easy_1100;

import java.util.Scanner;

public class Caisa_and_Pylons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h[]=new int[n+1];
        for (int i=1;i<=n;i++)h[i]=sc.nextInt();
        int min=0;int en=0;
        for (int i=0;i<n;i++){
            en+=h[i]-h[i+1];
            min=Math.min(min,en);
        }
        System.out.println(-1*min);
    }
}
