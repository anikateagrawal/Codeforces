package easy_800;

import java.util.Scanner;

public class Funny_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==3) System.out.println(-1);
            else {
                System.out.print(n+" "+(n-1)+" ");
                for (int i=1;i<=n-2;i++) System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
