package easy_1100;

import java.util.Scanner;

public class Little_Elephant_and_Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int in=s.indexOf("0");
        if(in==-1) System.out.println(s.substring(1));
        else System.out.println(s.substring(0,in)+s.substring(in+1));
    }
}
