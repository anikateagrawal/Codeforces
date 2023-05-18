package easy_900;

import java.util.Scanner;

public class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=0;
            while(n%3==0){
                if(n%6==0)n/=6;
                else n*=2;
                m++;
            }
            System.out.println(n==1?m:-1);
        }
    }
}
