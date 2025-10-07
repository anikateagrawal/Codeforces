package easy_1000;

import java.util.Scanner;

public class Minimum_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean flag=false;
            for (int i=2;i*i<=n;i++){
                if(n%i==0){
                    int d=n/i;
                    System.out.println(d+" "+(n-d));
                    flag=true;
                    break;
                }
            }
            if(!flag)
            System.out.println(1+" "+(n-1));
        }
    }
}
