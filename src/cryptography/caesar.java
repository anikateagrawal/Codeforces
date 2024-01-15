package cryptography;

import java.util.Scanner;

public class caesar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plain text");
        String pt=sc.nextLine();
        System.out.println("Enter key 1 to 26");
        int k=Integer.parseInt(sc.nextLine());
        String ct=encrypt(pt,k);
        System.out.println("Cipher text "+ct);
        String dpt=decrypt(ct,k);
        System.out.println("Decrypt Text "+dpt );

        System.out.println();
        System.out.println("Brute Force");
        for (int i=1;i<26;i++){
            System.out.println("Decrypt for key ="+i+" : "+decrypt(ct,i));
        }
    }
    static String encrypt(String s,int k){
        String ct="";
        for(char ch:s.toCharArray()){
            ct=ct+(char)('A'+(ch-'a'+k)%26);
        }
        return ct;
    }
    static String decrypt(String s,int k){
        String pt="";
        for(char ch:s.toCharArray()){
            pt=pt+(char)('a'+(ch-'A'-k+26)%26);
        }
        return pt;
    }
}
