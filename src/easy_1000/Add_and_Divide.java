package easy_1000;

import java.util.Scanner;

public class Add_and_Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            if(b==1){
                b++;c++;
            }
            int pow1=(int)(Math.log10(a)/Math.log10(b)+1);
            int pow2=(int)(Math.log10(a)/Math.log10(b+1)+1);
            while (pow1>pow2){
                b++;c++;
                pow1=(int)(1+Math.log(a)/Math.log(b));
                pow2=(int)(1+Math.log(a)/Math.log(b+1));
            }
            while (a>0){
                a/=b;c++;
            }
            System.out.println(c);
        }
    }
}
