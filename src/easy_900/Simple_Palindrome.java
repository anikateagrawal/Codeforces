package easy_900;

import java.util.Scanner;

public class Simple_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String v="aeiou";
            String ans="";
            int k=n%5;
            for (int i=0;i<5;i++){
                for (int j=0;j<n/5;j++){
                    ans+=v.charAt(i);
                }
                if(i<k)ans+=v.charAt(i);
            }
            System.out.println(ans);
        }
    }
}
