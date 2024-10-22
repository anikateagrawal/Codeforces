package easy_800;

import java.util.Scanner;

public class _Perfect_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for(int i=2;i<=n;i+=2) System.out.print((i)+" "+(i-1)+" ");
            if(n%2==1) System.out.println(n);
            else System.out.println();
        }
    }
}
