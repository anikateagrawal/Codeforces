package easy_800;

import java.util.Scanner;

public class FizzBuzz_Remixed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n<=2) {
                System.out.println(n+1);continue;
            }
            int d=(n-3)/15+1;
            d*=3;
            if(n%15<=2)d+=n%15+1;
            System.out.println(d);
        }
    }
}
