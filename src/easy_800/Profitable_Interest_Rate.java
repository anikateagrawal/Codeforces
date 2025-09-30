package easy_800;

import java.util.Scanner;

public class Profitable_Interest_Rate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>=b) System.out.println(a);
            else System.out.println(a-(b-a) > 0?2*a-b:0);
        }
    }
}
