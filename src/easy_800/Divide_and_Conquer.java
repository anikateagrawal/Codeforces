package easy_800;

import java.util.Scanner;

public class Divide_and_Conquer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x%y==0?"YES":"NO");
        }
    }
}
