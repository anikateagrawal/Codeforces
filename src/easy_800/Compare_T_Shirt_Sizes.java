package easy_800;

import java.util.Scanner;

public class Compare_T_Shirt_Sizes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            if(a.equals(b)) System.out.println("=");
            else{
                char ch1=a.charAt(a.length()-1);
                char ch2=b.charAt(b.length()-1);
                if(ch1<ch2) System.out.println(">");
                else if(ch2<ch1) System.out.println("<");
                else {
                    int x1=a.length()-1;
                    int x2=b.length()-1;
                    if(ch1=='L'){
                        if(x1>x2) System.out.println(">");
                        else System.out.println("<");
                    }
                    else{
                        if(x1<x2) System.out.println(">");
                        else System.out.println("<");
                    }

                }
            }
        }
    }
}
