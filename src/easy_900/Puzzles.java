package easy_900;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int d=Integer.MAX_VALUE;
        for (int i = 0; i+p-1<n ; i++) {
            d=Math.min(d,a[i+p-1]-a[i]);
        }
        System.out.println(d);
    }
}

