package easy_1100;

import java.util.Scanner;

public class Coprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[1001];
            for (int i=0;i<n;i++)a[sc.nextInt()]=i+1;
            int ans=-1;
            for (int i=1;i<1001;i++){
                for (int j=i;j<1001;j++){
                    if(a[i]==0||a[j]==0)continue;
                    int gcd=gcd(i,j);
                    if(gcd==1)ans=Math.max(ans,a[i]+a[j]);
                }
            }
            System.out.println(ans);
        }
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
