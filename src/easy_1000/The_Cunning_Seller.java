package easy_1000;

import java.util.Scanner;

public class The_Cunning_Seller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long ans=0;
            while (n!=0){
                int x=31;
                while (Math.pow(3,x)>n){
                    x--;
                }
                long num=(long)Math.pow(3,x);
                long d=n/num;
                n-=num*d;
                ans+=d*(Math.pow(3,x+1)+x*Math.pow(3,x-1));
            }
            System.out.println(ans);
        }
    }
}
