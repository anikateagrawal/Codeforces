package easy_800;

import java.util.Scanner;

public class Permutation_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.print(1+" ");
            for (int i=n;i>1;i--) System.out.print(i+" ");
            System.out.println();
        }
    }
}
