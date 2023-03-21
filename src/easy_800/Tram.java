package easy_800;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=0;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<t;i++){
            n-=sc.nextInt();
            n+=sc.nextInt();
            min=Math.max(min,n);
        }
        System.out.println(min);
    }
}
