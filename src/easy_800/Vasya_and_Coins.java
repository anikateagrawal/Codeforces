package easy_800;

import java.util.Scanner;

public class Vasya_and_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0) System.out.println(1);
            else {
                int c=2*b+a;
                System.out.println(c+1);
            }
        }
    }
}
