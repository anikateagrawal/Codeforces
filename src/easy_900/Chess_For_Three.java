package easy_900;

import java.util.Scanner;

public class Chess_For_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            if(sum%2==0)
                System.out.println(Math.min(sum/2,a+b));
            else
                System.out.println(-1);
        }
    }
}
