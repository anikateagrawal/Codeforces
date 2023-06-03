package easy_900;

import java.util.Scanner;

public class Nastya_and_Rice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int min=a-b;
            int max=a+b;
            int minp=c-d;
            int maxp=c+d;
            int overlap=Math.min(max*n,maxp)-Math.max(min*n,minp)+1;
            if(overlap>0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
