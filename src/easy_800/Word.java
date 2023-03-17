package easy_800;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int u=0,l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))u++;
            else l++;
        }
        if(l>=u) System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
}
