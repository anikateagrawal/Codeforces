package easy_800;

import java.util.Scanner;

public class Minimum_Varied_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s=sc.nextInt();
            int d=9;
            String ans="";
            while(s>d){
                s-=d;
                ans=d+ans;
                d--;
            }
            System.out.println(s+ans);
        }
    }
}
