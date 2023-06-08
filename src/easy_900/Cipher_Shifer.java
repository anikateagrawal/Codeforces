package easy_900;

import java.util.Scanner;

public class Cipher_Shifer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String ns="";
            for(int i=0;i<s.length();i++){
                ns+=s.charAt(i);
                i=s.indexOf(s.charAt(i),i+1);
            }
            System.out.println(ns);
        }
    }
}
