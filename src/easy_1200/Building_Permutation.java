package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Building_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        long ans=0;
        for (int i=0;i<n;i++){
            ans+=Math.abs(i+1-a[i]);
        }
        System.out.println(ans);
    }
}
