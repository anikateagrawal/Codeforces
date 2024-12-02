package easy_800;

import java.util.Scanner;

public class Integer_Moves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            double d=Math.sqrt(x*x+y*y);
            if(d==0.0) System.out.println(0);
            else if(d==(int)d) System.out.println(1);
            else System.out.println(2);
        }
    }
}
