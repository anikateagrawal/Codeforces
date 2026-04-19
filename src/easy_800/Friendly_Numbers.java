package easy_800;

import java.util.Scanner;

public class Friendly_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int c=0;
            for (int i=0;i<=100;i++){
                int num=x+i;
                if (num-sum(num)==x)c++;
            }
            System.out.println(c);
        }
    }
    static int sum(int n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
