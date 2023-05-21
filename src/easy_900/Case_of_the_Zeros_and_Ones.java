package easy_900;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Case_of_the_Zeros_and_Ones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&st.peek()!=ch)st.pop();
            else st.push(ch);
        }
        System.out.println(st.size());
    }
}
