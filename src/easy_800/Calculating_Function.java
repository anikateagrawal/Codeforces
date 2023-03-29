package easy_800;

import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=(n+1)/2;
        if(n%2==1)a*=-1;
        System.out.println(a);
    }
}
