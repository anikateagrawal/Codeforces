package easy_1000;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(x%i==0&&x/i<=n){
                c++;
            }
        }
        System.out.println(c);
    }
}
