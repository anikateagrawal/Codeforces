package easy_800;

import java.util.Scanner;

public class Potion_making {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=sc.nextInt();
            int gcd=gcd(k,100-k);
            System.out.println(100/gcd);
        }
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
