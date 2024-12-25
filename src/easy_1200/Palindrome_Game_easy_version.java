package easy_1200;

import java.util.Scanner;

public class Palindrome_Game_easy_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int z=0;
            for (char ch: s.toCharArray())if(ch=='0')z++;
            if(z==1||z%2==0) System.out.println("BOB");
            else System.out.println("ALICE");
        }
    }
}
