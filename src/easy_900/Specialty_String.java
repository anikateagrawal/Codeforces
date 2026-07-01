package easy_900;

import java.util.Scanner;
import java.util.Stack;

public class Specialty_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Stack<Character> st=new Stack<>();
            for (char ch :s.toCharArray()){
                if (!st.isEmpty() && st.peek() == ch)st.pop();
                else st.push(ch);
            }
            if (st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
