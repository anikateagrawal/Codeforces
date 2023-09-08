package easy_1000;

import java.util.Scanner;

public class Dreamoon_and_Stairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=n/2;
        int o=n%2;
        int mv=t+o;
        while (t>0&&mv%m!=0){
            mv++;
            t--;
        }
        if(mv%m==0) System.out.println(mv);
        else System.out.println(-1);
    }
}
