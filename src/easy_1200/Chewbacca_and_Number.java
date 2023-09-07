package easy_1200;

import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String s="";
        while(n>0){
            long d=n%10;
            if(d>9-d)d=9-d;
            s=d+s;
            n/=10;
        }
        if(s.charAt(0)=='0') System.out.println(9+s.substring(1));
        else System.out.println(s);
    }
}
