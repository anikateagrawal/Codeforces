package easy_800;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Vlad_and_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            if(n==1){
                if(a[0]==1) System.out.println("YES");
                else System.out.println("NO");
                continue;
            }
            Arrays.sort(a);
            if(a[n-1]-a[n-2]>1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
