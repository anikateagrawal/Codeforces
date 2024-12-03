package easy_800;

import java.util.Scanner;

public class Generate_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0) System.out.println(-1);
            else {
                for (int i=n;i>(n+1)/2;i--) System.out.print(i+" ");
                for (int i=1;i<=(n+1)/2;i++) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
