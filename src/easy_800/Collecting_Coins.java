package easy_800;

import java.util.Scanner;

public class Collecting_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int s=(a+b+c+n);
            int d=s/3;
            if(s%3!=0||a>d||b>d||c>d) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
