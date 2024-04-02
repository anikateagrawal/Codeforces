package easy_800;

import java.util.Scanner;

public class Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long x=sc.nextLong();
            if(fun(n,k,x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(int n,int k,long x){
        long s=1L*k*(k+1)/2;
        long f=1L*n*(n+1)/2-1L*(n-k)*(n-k+1)/2;
//        System.out.println(s+ " "+f);
        return s<=x&&x<=f;
    }
}
