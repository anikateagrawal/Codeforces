package easy_900;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d1=(c-a)/2;
            int d2=b-a;
            int d3=c-b;
            if((c-a)%2==0&&a+d1>0&&(a+d1)%b==0) System.out.println("YES");
            else if(b+d2>0&&(b+d2)%c==0) System.out.println("YES");
            else if(b-d3>0&&(b-d3)%a==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
