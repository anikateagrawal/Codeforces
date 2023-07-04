package easy_800;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String n="";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='.'){
                n+="0";
                continue;
            }
            if(s.charAt(i+1)=='.'){
                i++;
                n+="1";
            }
            else {
                i++;
                n+="2";
            }
        }
        System.out.println(n);
    }
}
