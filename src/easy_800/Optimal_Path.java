package easy_800;

import java.util.Scanner;

public class Optimal_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long c=1L*m*(m+1)/2;
            long r=1L*m*(n*(n+1)/2);
            System.out.println(c+r-m);
        }
    }
}
