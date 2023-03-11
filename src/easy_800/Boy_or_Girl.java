package easy_800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> ss=new HashSet<Character>();
        for(char c:s.toCharArray()){
            ss.add(c);
        }
        if(ss.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
