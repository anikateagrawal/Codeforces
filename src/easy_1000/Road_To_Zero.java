package easy_1000;

import java.util.Scanner;

public class Road_To_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextInt();
            long y=sc.nextInt();
            long a=sc.nextInt();
            long b=sc.nextInt();
            if(2*a<=b){
                System.out.println(a*(x+y));
            }
            else {
                System.out.println(b*Math.min(x,y)+a*Math.abs(x-y));
            }
        }
    }
}
