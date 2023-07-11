package easy_1000;

import java.util.Scanner;

public class Raising_Bacteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            c++;
            n=(n&(n-1));
        }
        System.out.println(c);
    }
}
