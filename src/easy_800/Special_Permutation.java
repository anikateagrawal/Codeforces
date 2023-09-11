package easy_800;

import java.util.Scanner;

public class Special_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.print(n+" ");
            for (int i = 1; i < n; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
