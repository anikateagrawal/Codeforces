package easy_800;

import java.util.Scanner;

public class Reverse_and_Concatenate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            if(isPalin(s)||k==0) System.out.println(1);
            else System.out.println(2);
        }
    }
    static boolean isPalin(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
