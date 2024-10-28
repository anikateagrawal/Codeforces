package easy_800;

import java.util.Scanner;

public class Subtraction_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>1) System.out.println(1);
            else if(b==2) System.out.println(3);
            else System.out.println(2);
        }
    }
}
