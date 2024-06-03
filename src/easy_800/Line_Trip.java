package easy_800;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int max=a[0]-0;
            for(int i=0;i<n-1;i++){
                max=Math.max(max,a[i+1]-a[i]);
            }
            max=Math.max(max,2*(x-a[n-1]));
            System.out.println(max);
        }
    }
}
