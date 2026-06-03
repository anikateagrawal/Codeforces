package easy_1000;

import java.util.Scanner;

public class Mike_and_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f[]=new int[26];
        for (char ch:s.toCharArray())f[ch-'a']++;
        int odd=0;
        for (int i:f)if (i%2==1)odd++;
        if (odd==0|| odd>3) System.out.println("NO");
        else System.out.println("YES");
    }
}
