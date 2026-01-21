package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Ashmal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a[]=new String[n];
            for (int i=0;i<n;i++)a[i]=sc.next();
            String ans="";
            for (String s:a) {
                String ns=ans+s;
                String ns2=s+ans;
                if(ns.compareTo(ns2)<0){
                    ans=ns;
                }
                else ans=ns2;
            }
            System.out.println(ans);
        }
    }
}
