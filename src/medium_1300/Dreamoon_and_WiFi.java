package medium_1300;

import java.util.Scanner;

public class Dreamoon_and_WiFi {
    static int t=0,c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int p=0;
        for(char ch:a.toCharArray()){
            if(ch=='+')p++;
            else p--;
        }
        String b=sc.next();
        fun(p,b,0,0);
        System.out.println(1.0*c/t);
    }
    static void fun(int p,String a,int p2,int i){
        if(i==a.length()){
            t++;
            if(p2==p)c++;
            return;
        }
        if(a.charAt(i)=='+')fun(p,a,p2+1,i+1);
        else if(a.charAt(i)=='-')fun(p,a,p2-1,i+1);
        else {
            fun(p,a,p2+1,i+1);
            fun(p,a,p2-1,i+1);
        }
    }
}
