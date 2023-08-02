package easy_800;

import java.util.Scanner;

public class Polycarp_and_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int r=n%3;
            int b1=n/3;
            int b2=n/3;
            if(r==2)b2++;
            if(r==1)b1++;
            System.out.println(b1+" "+b2);
        }
    }
}
