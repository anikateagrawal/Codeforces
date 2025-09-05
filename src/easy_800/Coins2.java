package easy_800;

import java.util.Scanner;

public class Coins2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int d=s/n;
        if(s%n!=0)d++;
        System.out.println(d);
    }
}
