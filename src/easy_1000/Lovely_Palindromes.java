package easy_1000;

import java.util.Scanner;

public class Lovely_Palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s+(new StringBuilder(s)).reverse());
    }
}
