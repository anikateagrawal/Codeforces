package easy_1000;

import java.util.Scanner;

public class The_Strict_Teacher_Easy_Version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int q=sc.nextInt();
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            int x1=Math.min(t1,t2);
            int x2=Math.max(t1,t2);
            int d=sc.nextInt();
            if (d<=x1) System.out.println(x1-1);
            else if (d>=x2) System.out.println(n-x2);
            else System.out.println((x2-x1)/2);
        }
    }
}
