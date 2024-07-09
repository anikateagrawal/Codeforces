package easy_1100;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int ans=10;
        while(k>0){
            ans+=9;
            if(sum(ans)==10)k--;
        }
        System.out.println(ans);
    }
    static  int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}
