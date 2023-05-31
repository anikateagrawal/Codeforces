package easy_900;

import java.util.Scanner;

public class Food_Buying {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int sum=0;
            while(x>=10){
                sum+=x/10*10;
                x=x/10+x%10;
            }
            System.out.println(sum+x);
        }
    }
}
