package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Heist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[n-1]-a[0]-n+1);
    }
}
