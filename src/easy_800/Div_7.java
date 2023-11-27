package easy_800;

import java.util.Scanner;

public class Div_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int r=n%7;
            if(r==0) System.out.println(n);
            else{
                int l=n%10;
                if(l-r<0) System.out.println(n+(7-r));
                else System.out.println(n-r);
            }
        }
    }
}
