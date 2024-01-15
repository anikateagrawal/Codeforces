package cryptography;

import java.util.Scanner;

public class vigenere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plain text");
        String pt=sc.nextLine();
        System.out.println("Enter key");
        String k=sc.nextLine();
        String ct=encrypt(pt,k);
        System.out.println("Cipher text "+ct);
        String dpt=decrypt(ct,k);
        System.out.println("Decrypt Text "+dpt );
    }
    static String encrypt(String s,String k){
        String ct="";
        int in=0;
        for(char ch:s.toCharArray()){
            ct=ct+(char)('A'+(ch-'a'+(k.charAt(in)-'a'))%26);
            in=(in+1)%k.length();
        }
        return ct;
    }
    static String decrypt(String s,String k){
        String pt="";
        int in=0;
        for(char ch:s.toCharArray()){
            pt=pt+(char)('a'+(ch-'A'-(k.charAt(in)-'a')+26)%26);
            in=(in+1)%k.length();
        }
        return pt;
    }
}
