package easy_800;

import java.util.Scanner;

public class SSeeeeiinngg_DDoouubbllee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            StringBuilder ss=new StringBuilder(s);
            ss.reverse();
            System.out.println(s+ss);
        }
    }
}
