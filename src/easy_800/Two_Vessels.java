package easy_800;

import java.util.Scanner;

public class Two_Vessels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double d=Math.abs(a-b)*1.0/2;
            int m=(int)Math.ceil(d/c);
            System.out.println(m);
        }
    }
}
