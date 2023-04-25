package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            for (int i = 0; i < n-1; i++) {
                if(a[i+1]-a[i]>1){
                    System.out.println("NO");
                    continue outer;
                }
            }
            System.out.println("YES");
        }
    }
}
