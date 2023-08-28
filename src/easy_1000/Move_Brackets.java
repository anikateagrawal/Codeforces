package easy_1000;

import java.util.Scanner;

public class Move_Brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            int o=0;
            for(char ch:s.toCharArray()){
                if(ch=='(')o++;
                else o--;
                if(o<0){
                    c++;
                    o++;
                }
            }
            System.out.println(c);
        }
    }
}
