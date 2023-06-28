package easy_800;

import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String n="";
            for(int i=0;i<s.length();i+=2)
            n+=s.charAt(i);
            n+=s.charAt(s.length()-1);
            System.out.println(n);
        }
    }
}
