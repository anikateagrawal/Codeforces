package easy_900;

import java.util.Scanner;

public class Painting_the_Ribbon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int d=n-(n+m-1)/m;
            if(d<=k) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
