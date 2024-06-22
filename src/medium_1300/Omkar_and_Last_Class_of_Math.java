package medium_1300;

import java.util.Scanner;

public class Omkar_and_Last_Class_of_Math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            boolean f=false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    int a=n/i;
                    int b=n-a;
                    System.out.println(a+" "+b);
                    f=true;
                    break;
                }
            }
            if(!f){
                System.out.println(1+" "+(n-1));
            }
        }
    }
}
