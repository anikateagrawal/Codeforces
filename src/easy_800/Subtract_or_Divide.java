package easy_800;

import java.util.Scanner;

public class Subtract_or_Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println(0);
            else if(n==2) System.out.println(1);
            else if(n==3) System.out.println(2);
            else if(n%2==0) System.out.println(2);
            else System.out.println(3);
        }
    }
}
