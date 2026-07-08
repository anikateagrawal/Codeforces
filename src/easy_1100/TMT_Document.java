package easy_1100;

import java.util.Scanner;

public class TMT_Document {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String rev=new StringBuilder(s).reverse().toString();
            if (check(s) && check(rev)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean check(String s){
        int a=0,b=0;
        boolean fl=true;
        for (char ch:s.toCharArray()){
            if (ch=='T')a++;
            else b++;
            if (b>a){
                fl=false;
                break;
            }
        }
        if (a!=2*b)fl=false;
        return fl;
    }
}
