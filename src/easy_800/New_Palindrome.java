package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class New_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Set<Character> s=new HashSet<>();
            String ss=sc.next();
            for (int i=0;i<ss.length()/2;i++){
                s.add(ss.charAt(i));
            }
            if(s.size()>1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
