package easy_1100;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s=sc.nextInt();
            int k=sc.nextInt();
            int m=sc.nextInt();
            int sd=Math.min(s,k);
            if (m/k%2==0)sd=s;
            int ans=Math.max(0,sd-m%k);
            System.out.println(ans);
        }
    }
}
