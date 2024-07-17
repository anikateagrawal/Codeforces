package easy_800;

import java.util.Scanner;

public class Parkway_Walk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=0;
            for (int i=0;i<n;i++)s+=sc.nextInt();
            System.out.println(Math.max(s-m,0));
        }
    }
}
