package easy_800;

import java.util.Scanner;

public class Palindromic_Indices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int c=1;
            int in=n/2;
            int l=in-1;
            int r=in+1;
            while (l>=0 && s.charAt(l)==s.charAt(in)){
                l--;c++;
            }
            while (r<n && s.charAt(r)==s.charAt(in)){
                r++;c++;
            }
            System.out.println(c);
        }
    }
}
