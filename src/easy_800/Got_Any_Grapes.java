package easy_800;

import java.util.Scanner;

public class Got_Any_Grapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean fl=true;
        if (x>a) {
            System.out.println("NO");return;
        }
        a-=x;
        if (y>a+b){
            System.out.println("NO");return;
        }
        int r=c+a+b-y;
        if (z>r){
            System.out.println("NO");return;
        }
        System.out.println("YES");
    }
}
