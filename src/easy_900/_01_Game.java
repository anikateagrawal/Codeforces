package easy_900;

import java.util.Scanner;
import java.util.Stack;

public class _01_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Stack<Character> st=new Stack<>();
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(!st.isEmpty()&&st.peek()!=ch)st.pop();
                else st.push(ch);
            }
            int m=(s.length()-st.size())/2;
            if(m%2==1) System.out.println("DA");
            else System.out.println("NET");
        }
    }
}
