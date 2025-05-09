package easy_900;

import java.util.Scanner;

public class Fireworks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long m=sc.nextLong()+1;
            long ans=(m+a-1)/a+(m+b-1)/b;
            System.out.println(ans);
        }
    }
}
