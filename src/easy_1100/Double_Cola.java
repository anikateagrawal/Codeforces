package easy_1100;

import java.util.Scanner;

public class Double_Cola {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        while(5*p<n){
            n-=5*p;
            p*=2;
        }
        System.out.println(name((n+(p-1))/p));
    }
    static String name(int n){
        if(n==1) return "Sheldon";
        else if(n==2) return "Leonard";
        else if(n==3)return "Penny";
        else if(n==4)return "Rajesh";
        return "Howard";
    }
}
