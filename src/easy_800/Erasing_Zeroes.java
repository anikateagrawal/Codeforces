package easy_800;

import java.util.Scanner;

public class Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int c=0;
            for (int i = s.indexOf('1'); i < s.lastIndexOf('1'); i++) {
                if(s.charAt(i)=='0')c++;
            }
            System.out.println(c);
        }
    }
}
