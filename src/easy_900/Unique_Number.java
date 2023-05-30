package easy_900;

import java.util.Scanner;

public class Unique_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int d=9;
            String ans="";
            while(x>0&&d>0){
                if(x>=d){
                    x-=d;
                    ans=d+ans;
                }
                d--;
            }
            if(x==0) System.out.println(ans);
            else System.out.println(-1);
        }
    }

}
