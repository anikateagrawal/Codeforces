package contests;

import java.util.Scanner;

public class Serval_and_Mocha_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            if(fun(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean fun(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(gcd(a[i],a[j])<=2)return true;
            }
        }
        return false;
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
