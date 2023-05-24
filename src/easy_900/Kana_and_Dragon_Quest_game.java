package easy_900;

import java.util.Scanner;

public class Kana_and_Dragon_Quest_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            while(x>20&&n>0){
                n--;
                x=x/2+10;
            }
            if(x<=m*10) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
