package easy_800;

import java.util.Scanner;

public class Median_Maximization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int b=n/2;
            if(n%2==0)b--;
            int r=n-b;
            System.out.println(s/r);
        }
    }
}
