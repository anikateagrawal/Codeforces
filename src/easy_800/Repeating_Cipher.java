package easy_800;

import java.util.Scanner;

public class Repeating_Cipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int i=1,in=0;
        String ans="";
        while (in<n){
            ans+=s.charAt(in);
            in+=i;
            i++;
        }
        System.out.println(ans);
    }
}
