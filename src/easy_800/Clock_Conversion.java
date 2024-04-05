package easy_800;

import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String h[]=s.split(":");
            int hh=Integer.parseInt(h[0]);
            if(hh<12) {
                if(hh==0) System.out.println("12:"+h[1]+" AM");
                else
                System.out.println(h[0]+":"+h[1]+" AM");
            }
            else {
                if(hh==12) System.out.println("12:"+h[1]+" PM");
                else
                System.out.println(String.format("%02d",(hh-12))+":"+h[1]+" PM");
            }
        }
    }
}
