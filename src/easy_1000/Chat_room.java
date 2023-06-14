package easy_1000;

import java.util.Scanner;

public class Chat_room {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String h="hello";
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==h.charAt(0))h=h.substring(1);
            if(h.length()==0)break;
        }
        if(h.length()==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
