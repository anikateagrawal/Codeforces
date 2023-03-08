package easy_800;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int c=a.compareTo(b);
        if(c<0) System.out.println(-1);
        else if (c>0) System.out.println(1);
        else System.out.println(0);
    }
}
