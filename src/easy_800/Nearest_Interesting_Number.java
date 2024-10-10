package easy_800;

import java.util.Scanner;

public class Nearest_Interesting_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int c=a;
        while(c>0){
            sum+=c%10;
            c/=10;
        }
        sum%=4;
        if(sum==0)sum=4;
        sum=4-sum;
        System.out.println(a+sum);
    }
}
