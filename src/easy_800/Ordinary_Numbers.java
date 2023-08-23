package easy_800;

import java.util.Scanner;

public class Ordinary_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int l=(""+n).length();
            int m=(l-1)*9;
            String d="";
            for (int i = 0; i < l; i++) {
                d+="1";
            }
            int dd=Integer.parseInt(d);
            System.out.println(n/dd+m);
        }
    }
}
