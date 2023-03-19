package easy_800;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long l=0;
        while(n>0){
            long d=n%10;
            if(d==4||d==7)l++;
            n/=10;
        }
        if(l==0){
            System.out.println("NO");
            return;
        }
        while (l>0){
            long d=l%10;
            if(d!=4&&d!=7){
                System.out.println("NO");
                return;
            }
            l/=10;
        }
        System.out.println("YES");
    }
}
