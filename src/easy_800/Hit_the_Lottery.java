package easy_800;

import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=0;
        n+=a/100;
        a%=100;
        n+=a/20;
        a%=20;
        n+=a/10;
        a%=10;
        n+=a/5;
        a%=5;
        n+=a;
        System.out.println(n);
    }
}
