package easy_800;

import java.util.Scanner;

public class LuoTianyi_and_the_Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char ch=s.charAt(0);
            boolean fl=true;
            for (char c:s.toCharArray())if (ch!=c)fl=false;
            if (fl) System.out.println(-1);
            else System.out.println(s.length()-1);
        }
    }
}
