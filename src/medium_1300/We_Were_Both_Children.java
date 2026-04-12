package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class We_Were_Both_Children {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            Arrays.sort(a);
            int f[]=new int[n+1];
            for (int i:a){
                if (i<=n)f[i]++;
            }
            int max=0;
            int fr[]=new int[n+1];
            for (int i=1;i<=n;i++){
                if (f[i]==0)continue;
                for (int j=1;i*j<=n;j++){
                    fr[j*i]+=f[i];
                    max=Math.max(max,fr[i*j]);
                }
            }
            System.out.println(max);
        }
    }

}
