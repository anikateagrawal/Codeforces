package easy_800;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();long k=sc.nextLong();
            if(n%2==1&&k%2==0)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
