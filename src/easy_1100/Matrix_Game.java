package easy_1100;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Matrix_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> r=new HashSet<>();
            Set<Integer> c=new HashSet<>();
            for (int i=0;i<n;i++)r.add(i);
            for (int i=0;i<m;i++)c.add(i);
            int a[][]=new int[n][m];
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                    if (a[i][j]==1){
                        r.remove(i);
                        c.remove(j);
                    }
                }
            }
            int min=Math.min(r.size(),c.size());
            if (min%2==1) System.out.println("Ashish");
            else System.out.println("Vivek");
        }
    }
}
