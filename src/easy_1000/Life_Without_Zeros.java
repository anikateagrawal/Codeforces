package easy_1000;

import java.util.Scanner;

public class Life_Without_Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String c=a.replace("0","");
        String d=b.replace("0","");
        String v=""+(Integer.parseInt(a)+Integer.parseInt(b));
        int ans=Integer.parseInt(v.replace("0",""));
        int new_ans=Integer.parseInt(c)+Integer.parseInt(d);
        if(ans==new_ans) System.out.println("YES");
        else System.out.println("NO");
    }
}
