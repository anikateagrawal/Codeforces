package easy_800;

import java.util.Scanner;

public class Entertainment_in_MAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            StringBuilder s2=new StringBuilder(s);
            s2.reverse();
            String r=s2.toString();
            if(s.compareTo(r)<=0){
                System.out.println(s);
            }
            else System.out.println(r+s);
        }
    }
}
