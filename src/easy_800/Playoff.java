package easy_800;

import java.util.Scanner;

public class Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long d=(long)Math.pow(2,n);
            System.out.println(d-1);
        }
    }
}
