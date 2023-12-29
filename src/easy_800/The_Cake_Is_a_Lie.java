package easy_800;

import java.util.Scanner;

public class The_Cake_Is_a_Lie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int a=m-1+m*(n-1);
            if(a==k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
