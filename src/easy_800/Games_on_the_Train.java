package easy_800;

import java.util.Scanner;

public class Games_on_the_Train {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int h[]=new int[n];
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                h[i]=sc.nextInt();
                max=Math.max(max,h[i]);
                min=Math.min(min,h[i]);
            }
            System.out.println(max-min+1);
        }
    }
}
