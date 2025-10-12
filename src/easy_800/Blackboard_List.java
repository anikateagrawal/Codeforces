package easy_800;

import java.util.Scanner;

public class Blackboard_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                max=Math.max(max,a[i]);
                min=Math.min(min,a[i]);
            }
            if (min<0) System.out.println(min);
            else System.out.println(max);
        }
    }
}
