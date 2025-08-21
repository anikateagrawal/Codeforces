package easy_900;

import java.util.Scanner;

public class Burenka_Plays_with_Fractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long  a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();

            if((a*d==b*c)||(a==0&&c==0))System.out.println(0);
            else if(a==0||b==0||b*c%(a*d)==0||a*d%(b*c)==0)System.out.println(1);
            else System.out.println(2);
        }
    }

}
