package easy_1000;

import java.util.Scanner;

public class Mahmoud_and_Longest_Uncommon_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.equals(b)) System.out.println(-1);
        else System.out.println(Math.max(a.length(),b.length()));
    }
}
