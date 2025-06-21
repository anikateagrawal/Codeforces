package easy_900;

import java.util.Scanner;

public class Brr_Brrr_Patapim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[2*n];
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    a[i+j+1]=sc.nextInt();
                }
            }
            int xor=0;
            for (int i=1;i<=2*n;i++)xor^=i;
            for (int i:a)xor^=i;
            a[0]=xor;
            for (int i:a) System.out.print(i+" ");
            System.out.println();
        }
    }
}
