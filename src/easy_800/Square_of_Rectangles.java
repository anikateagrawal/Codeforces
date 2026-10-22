package easy_800;

import java.util.Scanner;

public class Square_of_Rectangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l1=sc.nextInt();
            int b1=sc.nextInt();
            int l2=sc.nextInt();
            int b2=sc.nextInt();
            int l3=sc.nextInt();
            int b3=sc.nextInt();
            if (a1(l1,b1,l2,b2,l3,b3) ||a2(l1,b1,l2,b2,l3,b3) ||a3(l1,b1,l2,b2,l3,b3) ||a4(l1,b1,l2,b2,l3,b3) )
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean a1(int l1,int b1,int l2,int b2,int l3,int b3){
        return l3==l1 && b1+b2+b3==l1;
    }
    static boolean a2(int l1,int b1,int l2,int b2,int l3,int b3){
        return b3==b1 && l1+l2+l3==b1;
    }
    static boolean a3(int l1,int b1,int l2,int b2,int l3,int b3){
        return l2==l3 && l1+l2==b1 && b2+b3==b1;
    }
    static boolean a4(int l1,int b1,int l2,int b2,int l3,int b3){
        return b2==b3 && b1+b2==l1 && l2+l3==l1;
    }
}
