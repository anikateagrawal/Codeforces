package easy_800;

import java.util.Scanner;

public class The_67th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int p[]=new int[3*n];
            int s=1,e=3*n;
            for (int i=0;i<n;i++){
                p[3*i]=s++;
                p[3*i+2]=e--;
                p[3*i+1]=e--;
            }
            for (int i:p) System.out.print(i+" ");
            System.out.println();
        }
    }
}
