package contests;

import java.util.Scanner;

public class RemoveTwoLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            String s= sc.next();
            fun(s);
        }
    }
    static void fun(String s){
        int r=s.length()-1;
        for (int i = 1; i < s.length()-1; i++) {
            char ch=s.charAt(i);
            if(s.charAt(i-1)==s.charAt(i+1))r--;
        }
        System.out.println(r);
    }
}
