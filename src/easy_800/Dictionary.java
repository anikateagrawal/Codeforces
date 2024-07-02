package easy_800;

import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            char c1=a.charAt(1);
            char c2=a.charAt(0);
            int in=0;
            in=(c2-'a')*25+c1-'a';
            if(c2<c1)in--;
            System.out.println(in+1);
        }
    }
}
