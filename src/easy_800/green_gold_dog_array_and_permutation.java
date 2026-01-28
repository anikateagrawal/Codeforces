package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class green_gold_dog_array_and_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for (int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=i;
            }
            Arrays.sort(a,(i1,i2)->i1[0]-i2[0]);
            int ans[]=new int[n];
            for (int i=0;i<n;i++){
                ans[a[i][1]]=(n-i);
            }
            for (int i:ans) System.out.print(i+" ");
            System.out.println();
        }
    }
}
