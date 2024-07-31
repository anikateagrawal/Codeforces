package easy_800;

import java.util.Scanner;

public class Sum_of_2050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if(n%2050!=0) System.out.println(-1);
            else {
                long d=n/2050;
                int sum=0;
                while (d>0){
                    sum+=d%10;
                    d/=10;
                }
                System.out.println(sum);
            }
        }
    }
}
