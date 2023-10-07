package easy_800;

import java.util.Scanner;

public class Restore_the_Permutation_by_Merger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=2*sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int v[]=new int[51];
            for(int i:a){
                if(v[i]==0){
                    System.out.print(i+" ");
                    v[i]=1;
                }
            }
            System.out.println();
        }
    }
}
