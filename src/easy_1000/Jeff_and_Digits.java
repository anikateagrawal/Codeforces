package easy_1000;

import java.util.Scanner;

public class Jeff_and_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,z=0;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==0)z++;
            else f++;
        }
        if(z==0) {
            System.out.println(-1);return;
        }
        else if(f<9) {
            System.out.println(0);return;
        }
        for (int i=0;i<f/9*9;i++) System.out.print(5);
        for (int i=0;i<z;i++) System.out.print(0);
    }
}
