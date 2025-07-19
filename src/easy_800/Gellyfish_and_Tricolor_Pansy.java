package easy_800;

import java.util.Scanner;

public class Gellyfish_and_Tricolor_Pansy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int mina=Math.min(a,c);
            int minb=Math.min(b,d);
            if(mina>=minb) System.out.println("Gellyfish");
            else System.out.println("Flower");
        }
    }
}
