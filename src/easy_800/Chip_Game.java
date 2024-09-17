package easy_800;

import java.util.Scanner;

public class Chip_Game {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long sum=0L+n+m;
            if(sum%2==0) System.out.println("Tonya");
            else System.out.println("Burenka");
        }
    }
}
