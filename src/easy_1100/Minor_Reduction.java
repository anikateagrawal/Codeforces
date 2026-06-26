package easy_1100;

import java.util.Scanner;

public class Minor_Reduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String x=sc.next();
            int in=-1;
            int max=0;
            boolean f=false;
            int f1=0;
            for (int i=0;i<x.length()-1;i++){
                int d1=x.charAt(i)-'0';
                int d2=x.charAt(i+1)-'0';
                int s=d1+d2;
                if (i==0){
                    f1=s;
                }
                if (s>9){
                    f=true;
                    max=s;
                    in=i;
                }
            }
            if (f) System.out.println(x.substring(0,in)+max+x.substring(in+2));
            else System.out.println(f1+x.substring(2));
        }
    }
}
