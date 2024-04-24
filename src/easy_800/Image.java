package easy_800;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Set<Character> s=new HashSet<>();
            for(char ch:sc.next().toCharArray())s.add(ch);
            for(char ch:sc.next().toCharArray())s.add(ch);
            if(s.size()==1) System.out.println(0);
            else if(s.size()==2) System.out.println(1);
            else if(s.size()==3) System.out.println(2);
            else System.out.println(3);
        }
    }
}
