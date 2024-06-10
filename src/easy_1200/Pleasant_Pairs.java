package easy_1200;

import java.util.Scanner;

public class Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            long p=0;
            for (int i=0;i<n;i++){
                for (int j=1;j*a[i]<=2*n;j++){
                    int ii=i+1;
                    long jj=1L*j*a[i]-ii-1;
                    if(jj+1==ii)continue;
                    if(jj>=0&&jj<=n-1&&a[(int)jj]==j)p++;
                }
            }
            System.out.println(p/2);
        }

    }
}
