package easy_1000;

import java.util.Scanner;

public class Filling_Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1) System.out.println(0);
        else {
            n/=2;
            System.out.println((long)Math.pow(2,n));
        }
    }
}
