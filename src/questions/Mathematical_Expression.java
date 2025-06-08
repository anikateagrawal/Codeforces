package questions;

import java.util.Scanner;

public class Mathematical_Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.next();
        int b=sc.nextInt();
        String q=sc.next();
        int c=sc.nextInt();
        int ans=eval(a,b,s);
        if(ans==c) System.out.println("Yes");
        else System.out.println(ans);
    }
    static int eval(int a,int b, String s){
        switch (s){
            case "+":return a+b;
            case "-":return a-b;
            case "*":return a*b;
            case "/":return a/b;
        }
        return -1;
    }
}
