package easy_1000;

import java.util.Scanner;

public class Olesya_and_Rodion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        if(t==10){
            if(n==1) System.out.println(-1);
            else{
                for (int i = 0; i < n-1; i++) {
                    System.out.print(1);
                }
                System.out.print(0);
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(t);
            }
        }
    }
}
