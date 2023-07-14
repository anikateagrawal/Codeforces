package easy_800;

import java.util.Scanner;

public class Mishka_and_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,c=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b)m++;
            else if(b>a)c++;
        }
        if(m>c) System.out.println("Mishka");
        else if(c>m) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
