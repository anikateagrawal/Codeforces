package easy_900;

import java.util.Scanner;

public class Coin_Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int u=0;
            for(char ch:s.toCharArray()){
                if(ch=='U')u++;
            }
            if(u%2==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
