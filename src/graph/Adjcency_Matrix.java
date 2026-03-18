package graph;

import java.util.Arrays;
import java.util.Scanner;

public class Adjcency_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int mat[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            mat[s][d]=w;
        }
        for(int r[]:mat)System.out.println(Arrays.toString(r));
    }
}
