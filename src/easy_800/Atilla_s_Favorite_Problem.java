package easy_800;

import java.util.Scanner;

public class Atilla_s_Favorite_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char c=s.charAt(0);
            for(char ch:s.toCharArray()){
                if(ch>c)c=ch;
            }
            System.out.println(c-'a'+1);
        }
    }
}
