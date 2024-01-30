package easy_1000;

import java.util.Scanner;

public class Game_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m%n!=0) System.out.println(-1);
        else{
            int q=m/n;
            int c=0;
            while(q%3==0){
                q/=3;c++;
            }
            while(q%2==0){
                q/=2;c++;
            }
            if(q==1) System.out.println(c);
            else System.out.println(-1);
        }
    }
}
