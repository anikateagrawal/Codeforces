package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama_Mirai_s_Stones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n+1];
        long b[]=new long[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
            a[i]+=a[i-1];
        }
        Arrays.sort(b);
        for(int i=1;i<=n;i++)b[i]+=b[i-1];
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int t=sc.nextInt();
            int l=sc.nextInt()-1;
            int r=sc.nextInt();
            long ans=a[r]-a[l];
            if(t==2)ans=b[r]-b[l];
            System.out.println(ans);
        }
    }
}
