package easy_900;

import java.util.Scanner;

public class Distance_and_Axis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n<=k) System.out.println(k-n);
            else
            System.out.println((n%2)^(k%2));
        }
    }
}
