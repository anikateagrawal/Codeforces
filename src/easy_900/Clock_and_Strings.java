package easy_900;

import java.util.Scanner;

public class Clock_and_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int min=Math.min(c,d);
            int max=Math.max(c,d);
            if((a>=min&&a<=max)&&(b>=min&&b<=max)) System.out.println("NO");
            else if((a>=min&&a<=max)||(b>=min&&b<=max)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
