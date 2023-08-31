package easy_800;

import java.util.Scanner;

public class Equal_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                min=Math.min(min,a[i]);
            }
            int sum=0;
            for (int i:a){
                sum+=i-min;
            }
            System.out.println(sum);
        }
    }
}
