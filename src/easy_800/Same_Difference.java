package easy_800;

import java.util.Scanner;

public class Same_Difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int f[]=new int[26];
            for (char ch:s.toCharArray())f[ch-'a']++;
            System.out.println(n-f[s.charAt(n-1)-'a']);
        }
    }
}
