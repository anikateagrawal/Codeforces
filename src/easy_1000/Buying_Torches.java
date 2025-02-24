package easy_1000;

import java.util.Scanner;

public class Buying_Torches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextInt();
            long y=sc.nextInt();
            long k=sc.nextInt();
            long ts=y*k+k-1;
            long tr=k+(ts+(x-2))/(x-1);
            System.out.println(tr);
        }

    }
}
