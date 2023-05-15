package easy_900;

import java.util.Scanner;

public class Vasya_and_Socks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int d=1;
        for(int i=1;i<=n;i++){
            if(i==d*m){
                n++;
                d++;
            }
        }
        System.out.println(n);
    }
}
