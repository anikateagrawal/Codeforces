package easy_1000;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Premutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][n-1];
            for (int i=0;i<n;i++)
                for (int j=0;j<n-1;j++)a[i][j]=sc.nextInt();

            LinkedHashSet<Integer> s=new LinkedHashSet<>();
            int max=a[0][0],mf=1;
            for (int i=1;i<n;i++){
                if(a[i][0]==max)mf++;
                else {
                    mf--;
                    if(mf<0){
                        max=a[i][0];
                        mf=1;
                    }
                }
            }
            s.add(max);
            for (int i=0;i<n-1;i++){
                for (int j=0;j<n;j++){
                    if(!s.contains(a[j][i]))s.add(a[j][i]);
                }
            }
            for (int i:s) System.out.print(i+" ");
            System.out.println();
        }
    }
}
