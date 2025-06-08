package questions;

import java.util.Scanner;

public class The_Brothers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f1=sc.next();
        String l1=sc.next();
        String f2=sc.next();
        String l2=sc.next();
        if(l1.equals(l2)) System.out.println("ARE Brothers");
        else System.out.println("NOT");
    }
}
