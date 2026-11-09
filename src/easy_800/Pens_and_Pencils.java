package easy_800;

import java.util.Scanner;

public class Pens_and_Pencils {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int d= sc.nextInt();
            int k= sc.nextInt();
            int x= (a+c-1)/c;
            int y=(b+d-1)/d;
            if (x+y>k) System.out.println(-1);
            else System.out.println(x+" "+y);
        }
    }
}
