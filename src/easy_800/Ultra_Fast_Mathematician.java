package easy_800;

import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String a="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))a+="1";
            else a+="0";
        }
        System.out.println(a);
    }
}
