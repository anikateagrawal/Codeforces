package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class A_Gift_From_Orangutan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=Arrays.stream(a).max().getAsInt();
            int min=Arrays.stream(a).min().getAsInt();
            int d=max-min;
            System.out.println(d*(n-1));
        }
    }
}
