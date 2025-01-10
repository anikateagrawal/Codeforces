package easy_900;

import java.util.Scanner;

public class Wizard_of_Orz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int d=9;
            if(n==1) System.out.println(9);
            else if(n==2) System.out.println(98);
            else{
                n-=2;
                System.out.print(98);
                while (n-->0){
                    System.out.print(d);
                    d=(d+1+10)%10;
                }
                System.out.println();
            }

        }
    }
}
