package easy_900;

import java.util.Scanner;

public class Array_Reodering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if(gcd(a[i],2*a[j])>1||gcd(2*a[i],a[j])>1)c++;
                }
            }
            System.out.println(c);
        }
    }
    static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
