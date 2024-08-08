package easy_800;

import java.util.Scanner;

public class A_B_Again {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
