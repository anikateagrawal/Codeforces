package easy_800;

import java.util.Scanner;
import java.util.Stack;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        char l=' ';
        int c=0;
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(l!=' '&&l==ch)c++;
            else l=ch;
        }
        System.out.println(c);
    }
}
