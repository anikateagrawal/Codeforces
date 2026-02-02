package easy_800;

import java.util.Scanner;

public class Chips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=0;
        while(i<=m){
            m-=(i+1);
            i=(i+1)%n;
        }
        System.out.println(m);
    }
}
