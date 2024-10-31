package easy_900;

import java.util.Scanner;

public class Long_Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s1=sc.next();
            int z1=sc.nextInt();
            while (z1-->0)s1+="0";
            String s2=sc.next();
            int z2=sc.nextInt();
            while (z2-->0)s2+="0";
            int c=s1.length()==s2.length()?s1.compareTo(s2):s1.length()-s2.length();
            if(c>0) System.out.println(">");
            else if(c==0) System.out.println("=");
            else System.out.println("<");
        }
    }
}
