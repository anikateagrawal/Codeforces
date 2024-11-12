package easy_800;

import java.util.Scanner;

public class Square_Counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long s=sc.nextLong();
            long n2=n*n;
            long e=s/n2;
            System.out.println(e);
        }
    }
}
