package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Digit_Minimization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char c[]=s.toCharArray();
            Arrays.sort(c);
            if(s.length()==2) System.out.println(s.charAt(1));
            else System.out.println(c[0]);
        }
    }
}
