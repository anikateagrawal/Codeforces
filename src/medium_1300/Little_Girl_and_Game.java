package medium_1300;

import java.util.Scanner;

public class Little_Girl_and_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f[]=new int[26];
        for(char ch:s.toCharArray())f[ch-'a']++;
        int o=0;
        for(int i:f)if(i%2==1)o++;
        if(o<1)System.out.println("First");
        else if(o%2==0)System.out.println("Second");
        else System.out.println("First");
    }
}
