package easy_800;

import java.util.Scanner;

public class Pretty_Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println(1);
            else if(n%2==1)System.out.print("3 1 2 ");
            else System.out.print("2 1 ");
            for (int i=4-(1-n%2);i<=n;i+=2) System.out.print((i+1)+" "+i+" ");
            System.out.println();
        }
    }
}
