package easy_1000;

import java.util.Scanner;

public class Donut_Shops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<c){
                System.out.print(1+" ");
                if(1L*b*a>c) System.out.println(b);
                else System.out.println(-1);
            }
            else {
                System.out.println(-1+" "+b);
            }
        }
    }
}
