package easy_1000;

import java.util.Scanner;

public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
//        System.out.println(Integer.toBinaryString('a')+" "+Integer.toBinaryString('A')); //6th bit is different
        if(check(s)) {
            System.out.println(change(s));
        }
        else System.out.println(s);
    }
    static String change(String s){
        String ns="";
        for(char ch:s.toCharArray()){
            ns=ns+(char)(ch^(1<<5));
        }
        return ns;
    }
    static boolean check(String s){
        for (int i = 1; i <s.length() ; i++) {
            if(Character.isLowerCase(s.charAt(i)))return false;
        }
        return true;
    }
}
