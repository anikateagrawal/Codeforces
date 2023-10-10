package easy_800;

import java.util.Scanner;

public class Gennady_and_a_Card_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        boolean f=false;
        for (int i = 0; i < 5; i++) {
            String c=sc.next();
            if(t.charAt(0)==c.charAt(0)||t.charAt(1)==c.charAt(1))f=true;
        }
        if(f) System.out.println("YES");
        else System.out.println("NO");
    }
}
