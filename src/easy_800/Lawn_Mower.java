package easy_800;

import java.util.Scanner;

public class Lawn_Mower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int w=sc.nextInt();
            System.out.println(n-n/w);
        }
    }
}
