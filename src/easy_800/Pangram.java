package easy_800;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        if(fun(s)) System.out.println("YES");
        else System.out.println("NO");
    }
    static boolean fun(String s){
        s=s.toLowerCase();
//        System.out.println(s);
        String a="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++){
            if(!s.contains(""+a.charAt(i)))return false;
        }
        return true;
    }
}
