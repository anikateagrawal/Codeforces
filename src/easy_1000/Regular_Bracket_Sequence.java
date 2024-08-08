package easy_1000;

import java.util.Scanner;

public class Regular_Bracket_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if(s.length()%2==1||s.charAt(0)==')'||s.charAt(s.length()-1)=='(') System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
