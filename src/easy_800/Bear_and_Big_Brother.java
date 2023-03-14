package easy_800;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        while(a<=b){
            a*=3;
            b*=2;
            c++;
        }
        System.out.println(c);
    }
}
