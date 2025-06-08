package questions.week1;

import java.util.Scanner;

public class _Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)) System.out.println(Character.toLowerCase(ch));
        else System.out.println(Character.toUpperCase(ch));
    }
}
