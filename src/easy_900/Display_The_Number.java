package easy_900;

import java.util.Scanner;

public class Display_The_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            StringBuilder ans=new StringBuilder("");
            while (n>3){
                ans.append("1");
                n-=2;
            }
            if(n==3)ans.append("7");
            else if(n==2)ans.append("1");
            ans.reverse();
            System.out.println(ans.toString());
        }
    }
}
