package easy_800;

import java.util.Scanner;

public class Preparing_for_the_Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            for (int i=n-k;i>0;i--) System.out.print(i+" ");
            for(int i=n-k+1;i<=n;i++) System.out.print(i+" ");
            System.out.println();
        }
    }
}
