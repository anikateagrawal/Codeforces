package questions;

import java.util.Scanner;

public class Float_or_int {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        int num=(int)n;
        if(num==n) System.out.println("int "+num);
        else System.out.println("float "+num+" "+(n-num));

    }
}
