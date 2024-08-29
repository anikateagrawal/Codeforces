package easy_1100;

import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int min=Math.min(a,Math.min(b,c));
            int sum=a+b+c;
            if (sum%9==0){
                int q=sum/9;
                if(min<q) System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
