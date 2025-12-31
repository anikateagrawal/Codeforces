package easy_800;

import java.util.Scanner;

public class Rising_Sand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            if(k==1){
                System.out.println((n-1)/2);
            }
            else {
                int ans=0;
                for (int i=1;i<n-1;i++){
                    if(a[i]>a[i-1]+a[i+1])ans++;
                }
                System.out.println(ans);
            }
        }
    }
}
