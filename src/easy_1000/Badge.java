package easy_1000;

import java.util.HashSet;
import java.util.Scanner;

public class Badge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt()-1;
        for (int i=0;i<n;i++){
            System.out.print(dfs(a,i,new HashSet<>())+" ");
        }
    }

    private static int dfs(int[] a, int i, HashSet<Integer> hashSet) {
        if (hashSet.contains(i))return i+1;
        hashSet.add(i);
        return dfs(a,a[i],hashSet);
    }
}
