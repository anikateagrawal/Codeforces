package easy_1000;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int spell=0;
        while (s.length()>1){
            spell++;
            s=sum_of_digits(s);
        }
        System.out.println(spell);
    }
     static  String sum_of_digits(String s){
        int sum=0;
        for (char ch:s.toCharArray()){
            sum+=ch-'0';
        }
        return ""+sum;
    }
}
