package easy_800;

import java.util.Scanner;

public class Strong_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char in='a';
            for (int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    if(s.charAt(i)==in)in=(char)(in+1);
                    s=s.substring(0,i+1)+in+s.substring(i+1);
                    in=' ';
                    break;
                }
            }
            if(in==' ') System.out.println(s);
            else {
                if(s.charAt(0)==in)in=(char)(in+1);
                System.out.println(in+s);
            }
        }
    }
}
