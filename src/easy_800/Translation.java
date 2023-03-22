package easy_800;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String ns="";
        for (int i = s.length()-1; i>=0; i--) {
            ns+=s.charAt(i);
        }
        if(t.equals(ns)) System.out.println("YES");
        else System.out.println("NO");
    }
}
