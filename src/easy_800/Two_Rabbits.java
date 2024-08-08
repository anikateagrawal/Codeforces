package easy_800;

import java.util.Scanner;

public class Two_Rabbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=y-x;
            int rv=a+b;
            if(d%rv==0) System.out.println(d/rv);
            else System.out.println(-1);
        }
    }
}
