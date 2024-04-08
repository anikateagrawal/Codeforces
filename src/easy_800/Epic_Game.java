package easy_800;

import java.util.Scanner;

public class Epic_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        int n=sc.nextInt();
        int t=0;
        while (gcd(a[t],n)<=n){
            n-=gcd(a[t],n);
            t=(t+1)%2;
        }
        System.out.println(1-t);
    }
    static  int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
