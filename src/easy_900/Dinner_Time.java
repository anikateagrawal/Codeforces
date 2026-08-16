package easy_900;

import java.util.Scanner;

public class Dinner_Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int d=n/p;
            if (d*q!=m) {
                if(n%p==0)  System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("YES");
        }
    }
}
