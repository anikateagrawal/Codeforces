package easy_800;

import java.util.Arrays;
import java.util.Scanner;


public class Sequence_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int x=sc.nextInt();
            Arrays.sort(a);
            if (x>=a[0] && x<=a[n-1]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
