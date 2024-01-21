package easy_800;

import java.util.Scanner;

public class Frog_Jumping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
            int ab=a-b;
            long p=1L*(k/2)*ab+(k%2)*a;
            System.out.println(p);
        }
    }
}
