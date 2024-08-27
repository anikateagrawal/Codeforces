package medium_1500;

import java.util.Arrays;
import java.util.Scanner;

public class Little_Girl_and_Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        int f[]=new int[n+1];
        for (int i=0;i<q;i++){
            int l=sc.nextInt()-1;
            int r=sc.nextInt();
            f[l]++;
            f[r]--;
        }
        for (int i=1;i<=n;i++){
            f[i]+=f[i-1];
        }
        Arrays.sort(a);
        Arrays.sort(f);
        long sum=0;
        for (int i=1;i<=n;i++){
            sum+=1L*f[i]*a[i-1];
        }
        System.out.println(sum);
    }

}
