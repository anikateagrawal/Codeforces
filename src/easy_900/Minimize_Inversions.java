package easy_900;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_Inversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                a[i][1]=sc.nextInt();
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            for (int i=0;i<n;i++) System.out.print(a[i][0]+" ");
            System.out.println();
            for (int i=0;i<n;i++) System.out.print(a[i][1]+" ");
            System.out.println();
        }
    }
}
