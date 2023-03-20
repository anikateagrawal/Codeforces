package contests;

import java.util.Scanner;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();int c=sc.nextInt();
            if(a+b==c) System.out.println("+");
            else System.out.println("-");
        }
    }
}
