package easy_800;

import java.util.Scanner;

public class Nearest_Interesting_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(sum(a)%4!=0){
            a++;
        }
        System.out.println(a);
    }
    static int sum(int c){
        int sum=0;
        while(c>0){
            sum+=c%10;
            c/=10;
        }
        return sum;
    }
}
