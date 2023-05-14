package easy_900;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=2;i<=32;i++){
                int d=(int)(Math.pow(2,i)-1);
                if(n%d==0){
                    System.out.println(n/d);
                    break;
                }
            }
        }
    }
}
