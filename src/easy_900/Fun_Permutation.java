package easy_900;

import java.util.Scanner;

public class Fun_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            for (int i=0;i<n;i++){
                System.out.print(n-a[i]+1+" ");
            }
            System.out.println();
        }
    }
}
