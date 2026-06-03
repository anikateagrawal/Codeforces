package easy_1000;

import java.util.Scanner;

public class Mike_and_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ch=0;
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))ch++;
            i++;j--;
        }
        if (ch==0&&s.length()%2==0||ch>1) System.out.println("NO");
        else System.out.println("YES");
    }
}
