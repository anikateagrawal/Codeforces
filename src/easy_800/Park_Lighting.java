package easy_800;

import java.util.Scanner;

public class Park_Lighting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=m*n;
            int l=(s+1)/2;
            System.out.println(l);
        }
    }
}
