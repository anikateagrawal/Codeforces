package medium_1300;

import java.util.Arrays;
import java.util.Scanner;

public class Strange_Birthday_Party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k[]=new int[n];
            for (int i=0;i<n;i++)k[i]=sc.nextInt()-1;
            int c[]=new int[m];
            for (int i=0;i<m;i++)c[i]=sc.nextInt();
            Arrays.sort(k);
            int p=0;
            long ans=0;
            for (int i=n-1;i>=0;i--){
                int k2=k[i];
                if(p<m && c[p]<=c[k2]){
                    ans+=c[p++];
                }
                else ans+=c[k2];
//                System.out.println(ans);
            }
            System.out.println(ans);
        }
    }
}
