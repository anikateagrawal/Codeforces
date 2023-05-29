package easy_900;

import java.util.Scanner;

public class Magic_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.startsWith("4")||s.contains("0")||s.contains("2")||s.contains("3")||s.contains("5")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9")||s.contains("444"))
            System.out.println("NO");
        else System.out.println("YES");
    }
}
