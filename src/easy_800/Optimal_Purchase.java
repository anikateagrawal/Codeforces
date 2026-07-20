package easy_800;

import java.util.Scanner;

public class Optimal_Purchase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            long a=sc.nextInt();
            long b=sc.nextInt();
            if (3*a<=b) System.out.println(n*a);
            else {
                long ans=n/3*b;
                if (n%3==2)ans+=Math.min(b,2*a);
                else if (n%3==1)ans+=Math.min(b,a);
                System.out.println(ans);
            }
        }
    }
}
