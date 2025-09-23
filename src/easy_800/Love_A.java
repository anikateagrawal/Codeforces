package easy_800;

import java.util.Scanner;

public class Love_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for (char ch:s.toCharArray()){
            if(ch=='a')c++;
        }
        System.out.println(Math.min(2*c-1,s.length()));
    }
}
