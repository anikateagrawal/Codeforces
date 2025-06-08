package questions.week1;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=sc.next();
        int b=sc.nextInt();
        String ans=sign(a,b);
        if(ans.equals(s)) System.out.println("Right");
        else System.out.println("Wrong");
    }
    static String sign(int a,int b){
        if (a>b)return ">";
        if (a<b)return "<";
        return "=";
    }
}
