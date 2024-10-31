package easy_900;

import java.util.Scanner;

public class Long_Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s1=sc.next();
            int z1=sc.nextInt();
            String s2=sc.next();
            int z2=sc.nextInt();
            int l1=s1.length()+z1;
            int l2=s2.length()+z2;
            if(l1>l2){
                System.out.println(">");
            }
            else if(l2>l1){
                System.out.println("<");
            }
            else{
                while (s1.length()!=s2.length()){
                    if(s1.length()<s2.length())s1+="0";
                    else s2+="0";
                }
                int c=s1.compareTo(s2);
                if(c==0) System.out.println("=");
                else if (c>0) System.out.println(">");
                else System.out.println("<");
            }

        }
    }
}
