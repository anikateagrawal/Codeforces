package easy_1000;

import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=""+n;
        if(s.contains("0")||s.contains("1")||s.contains("2")||s.contains("3")||s.contains("5")||s.contains("6")||s.contains("8")||s.contains("9")){
            if(n%4==0||n%7==0||n%47==0||n%74==0||n%477==0||n%774==0) System.out.println("YES");
            else System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
