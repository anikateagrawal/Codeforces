package easy_1000;

import java.util.Scanner;

public class New_Year_Candles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=0;
        while(a>=b){
            int x=a/b;
            h+=x*b;
            a=a%b+x;
        }
        h+=a;
        System.out.println(h);
    }
}
