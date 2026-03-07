package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int in=(n-1)/2;
        System.out.println(a[in]);
    }
}
