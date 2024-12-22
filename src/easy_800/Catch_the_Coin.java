package easy_800;

import java.util.Scanner;

public class Catch_the_Coin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>=-1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
