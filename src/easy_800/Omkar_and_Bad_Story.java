package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Omkar_and_Bad_Story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            if (a[0]<0) System.out.println("No");
            else {
                System.out.println("YES");
                System.out.println(300);
                for (int i=0;i<300;i++) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
