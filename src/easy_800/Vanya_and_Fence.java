package easy_800;

import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int c=n;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if(a>h)c++;
        }
        System.out.println(c);
    }
}
