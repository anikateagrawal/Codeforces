package easy_800;

import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a4=sc.nextInt();
            int a5=sc.nextInt();
            int a31=a1+a2;
            int a32=a4-a2;
            int a33=a5-a4;
            if(a31==a32 && a32==a33) System.out.println(3);
            else if(a31==a32 || a32==a33) System.out.println(2);
            else System.out.println(1);
        }
    }
}
