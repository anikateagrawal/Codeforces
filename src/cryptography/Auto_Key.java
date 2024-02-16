package cryptography;

import java.util.Scanner;

public class Auto_Key {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("Enter 1 for encryption\n2 for decryption\n3 for burte force\n4 to exit");
            String ch=sc.nextLine();
            switch (ch){
                case "1":encryption();break;
                case "2":decryption();break;
                case "3":bruteforce();break;
                case "4":System.exit(0);
                default:
                    System.out.println("Wrong choice retry");
            }
        }
    }

    static void bruteforce(){
        String pt=inputPlainText();
        String ct=inputCipherText();
        for (int k=1;k<26;k++){
            String pt2=decrypt(ct,k);
            if(pt2.equals(pt)){
                System.out.println("key is "+k);
                return;
            }
        }
        System.out.println("Cipher does not match to plain text");
    }
    static String encrypt(String s,int k){
        String ct="";
        for(char ch:s.toCharArray()){
            if(ch==' '){
                ct+=" ";continue;
            }
            ct=ct+(char)('A'+(ch-'a'+k)%26);
            k=ch-'a';
        }
        return ct;
    }
    static String decrypt(String s,int k){
        String pt="";
        for(char ch:s.toCharArray()){
            if(ch==' '){
                pt+=" ";
                continue;
            }
            pt=pt+(char)('a'+(ch-'A'-k+26)%26);
            k=(ch-'A'-k+26)%26;
        }
        return pt;
    }
    static void decryption(){
        String ct=inputCipherText();
        int k=inputKey();
        System.out.println(decrypt(ct,k));
    }

    static String inputCipherText(){
        System.out.println("Enter cipher text in Upper case");
        String ct=sc.nextLine();
        if(checkUpper(ct))return ct;
        System.out.println("Please enter correct cipher text");
        return inputCipherText();
    }
    static void encryption(){
        String pt=inputPlainText();
        int k=inputKey();
        System.out.println(encrypt(pt,k));
    }
    static int inputKey(){
        System.out.println("Enter key from 1 to 25");
        String key=sc.nextLine();
        if(checkKey(key))return Integer.parseInt(key);
        System.out.println("Please enter correct key");
        return inputKey();
    }
    static boolean checkKey(String s){
        for(char ch:s.toCharArray()){
            if(ch<'0'||ch>'9')return false;
        }
        return true;
    }
    static String inputPlainText(){
        System.out.println("Enter plain text in lower case");
        String pt=sc.nextLine();
        if(checkLower(pt))return pt;
        System.out.println("Please enter correct plain text");
        return inputPlainText();
    }
    static boolean checkLower(String s){
        for(char ch:s.toCharArray()){
            if(ch==' ')continue;
            if(ch<'a'||ch>'z')return false;
        }
        return true;
    }
    static boolean checkUpper(String s){
        for(char ch:s.toCharArray()){
            if(ch==' ')continue;
            if(ch<'A'||ch>'Z')return false;
        }
        return true;
    }
}
