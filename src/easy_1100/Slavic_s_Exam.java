package easy_1100;

import java.util.Scanner;

public class Slavic_s_Exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            String s2=sc.next();
            int i=0,j=0;
            String ans="";
            while (i<s.length()&&j<s2.length()){
                if(s.charAt(i)=='?'){
                    ans+=s2.charAt(j);
                    i++;
                    j++;
                }
                else if(s.charAt(i)==s2.charAt(j)){
                    ans+=s2.charAt(j);
                    i++;
                    j++;
                }
                else {
                    ans+=s.charAt(i++);
                }
            }
            if(j==s2.length()) {
                while (i<s.length()){
                    ans+=s.charAt(i)=='?'?"a":s.charAt(i);
                    i++;
                }
                System.out.println("YES\n"+ans);
            }
            else System.out.println("NO");
        }
    }
}
