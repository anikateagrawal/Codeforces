package easy_800;

import java.util.Scanner;

public class Construct_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=n+1;i<=2*n;i++) System.out.print(i+" ");
            System.out.println();
        }
    }
}
