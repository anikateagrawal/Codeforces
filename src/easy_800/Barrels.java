package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Barrels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            long sum=0;
            for (int i=1;i<=k+1;i++)sum+=a[n-i];
            System.out.println(sum);
        }
    }
}
