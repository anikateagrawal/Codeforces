package easy_800;

import java.util.Scanner;

public class Z_mod_X_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=c+b+a;
            int y=c+b;
            int z=c;
            System.out.println(x+" "+y+" "+c);
        }
    }
}
