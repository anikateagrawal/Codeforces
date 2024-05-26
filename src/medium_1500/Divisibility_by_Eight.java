package medium_1500;

import java.util.Scanner;

public class Divisibility_by_Eight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean f=false;
        String ans="";
        for (int i=0;i<s.length();i++) {
            String a = "" + s.charAt(i);
            int n = Integer.parseInt(a);
            if (n % 8 == 0) {
                f = true;
                ans = a;
            }
            for (int j = i + 1; j < s.length(); j++) {
                String b = a + s.charAt(j);
                n = Integer.parseInt(b);
                if (n % 8 == 0) {
                    f = true;
                    ans = b;
                }
                for (int k = j + 1; k < s.length(); k++) {
                    String c = b + s.charAt(k);
                    n = Integer.parseInt(c);
                    if (n % 8 == 0) {
                        f = true;
                        ans = c;
                    }
                }
            }
        }
        if(f){
            System.out.println("YES");
            System.out.println(ans);
        }
        else System.out.println("NO");
    }
}
