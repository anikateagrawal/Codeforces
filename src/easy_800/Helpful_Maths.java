package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a[]=s.split("\\+");
        Arrays.sort(a);
        String ns="";
        for (String l:a)ns+=l+"+";
        System.out.println(ns.substring(0,ns.length()-1));
    }
}
