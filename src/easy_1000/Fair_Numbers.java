package easy_1000;

import java.util.Scanner;

public class Fair_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            while (!check(x))x++;
            System.out.println(x);
        }
    }
    static boolean check(long x){
        long n=x;
        boolean flag=true;
        while (n>0){
            long d=n%10;
            n/=10;
            if (d==0)continue;
            if(x%d!=0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
