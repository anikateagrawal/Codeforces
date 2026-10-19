package easy_1200;

import java.util.Scanner;

public class Poisoned_Dagger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long h=sc.nextLong();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long lo=1,hi=h;
            long ans=h;
            while (lo<=hi){
                long k=lo+(hi-lo)/2;
                long hl=0;
                for (int i=1;i<n;i++){
                    hl+=Math.min(a[i]-a[i-1],k);
                    if (hl>=h)break;
                }
                hl+=k;
                if (hl>=h){
                    ans=k;
                    hi=k-1;
                }
                else lo=k+1;
            }
            System.out.println(ans);
        }
    }
}
