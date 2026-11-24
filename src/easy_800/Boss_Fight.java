package easy_800;

import java.util.Scanner;

public class Boss_Fight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int fr[]=new int[1001];
            int max=a[0];
            int mf=1;
            for (int i:a){
                fr[i]++;
                if (fr[i]>mf){
                    mf=fr[i];
                    max=i;
                }
            }
            int r=n-mf;
            int rr=Math.max(0,mf-r-2);
            sum-=rr*max;
            System.out.println(sum);
        }
    }
}
