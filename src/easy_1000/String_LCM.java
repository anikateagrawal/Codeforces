package easy_1000;

import java.util.Scanner;

public class String_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String a=sc.next();
            String b=sc.next();
            int l1=a.length();
            int l2=b.length();
            while(l1!=l2){
                if(l1<l2)l1+=a.length();
                else l2+=b.length();
            }
            StringBuilder a1=new StringBuilder(a);
            while(a1.length()!=l1)a1.append(a);
            StringBuilder a2=new StringBuilder(b);
            while (a2.length()!=l2)a2.append(b);
            if((""+a1).equals(""+a2)) System.out.println(a1);
            else System.out.println("-1");
        }
    }
}
