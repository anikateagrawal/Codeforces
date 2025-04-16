package easy_1200;

import java.util.Scanner;

public class k_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n%4==0){
                System.out.println((n/2)+" "+(n/4)+" "+(n/4));
            }
            else if(n%2==0){
                n-=2;
                System.out.println(2+" "+(n/2)+" "+(n/2));
            }
            else System.out.println(1+" "+(n/2)+" "+(n/2));
        }
    }
}
