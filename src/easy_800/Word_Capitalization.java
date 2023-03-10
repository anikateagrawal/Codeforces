package easy_800;

import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=Character.toUpperCase(s.charAt(0))+s.substring(1);
        System.out.println(s);
    }
}
