package easy_800;

import java.util.Scanner;

public class Sum_of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n<7||n==9) System.out.println("NO");
            else {
                int a=1,b=2,c=n-3;
                if(c%3==0){
                    c-=2;b+=2;
                }
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
        }
    }
}
