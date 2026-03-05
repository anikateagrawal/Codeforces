package easy_800;

import java.util.Scanner;

public class Equal_Occurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int f[]=new int[n+1];
            int ff[]=new int[n+1];
            for (int i:a){
                f[i]++;
                ff[f[i]]++;
            }
            int ans=0;
            for (int i=0;i<n+1;i++){
                ans=Math.max(ans,ff[i]*i);
            }
            System.out.println(ans);
        }
    }
}
