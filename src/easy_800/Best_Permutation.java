package easy_800;

import java.util.Scanner;

public class Best_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0){
                for (int i=1;i<=n-2;i+=2) System.out.print((i+1)+" "+(i)+" ");
                System.out.println((n-1)+" "+(n));
            }
            else {
                System.out.print("1 ");
                for (int i=2;i<=n-2;i+=2) System.out.print((i+1)+" "+(i)+" ");
                System.out.println((n-1)+" "+(n));
            }
        }
    }
}
