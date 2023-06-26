package easy_1200;

import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int a=sc.nextInt();int b=sc.nextInt();
        int min=n*a;
        min=Math.min(min,n/m*b+n%m*a);
        min=Math.min(min,(n+m-1)/m*b);
        System.out.println(min);
    }
}
