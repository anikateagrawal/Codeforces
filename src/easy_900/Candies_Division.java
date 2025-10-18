package easy_900;

import java.util.Scanner;

public class Candies_Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int m=n%k;
            int d=0;
            if(m>k/2)d=m-k/2;
            System.out.println(n-d);
        }
    }
}
