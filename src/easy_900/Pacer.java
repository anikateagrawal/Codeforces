package easy_900;

import java.util.Scanner;

public class Pacer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int ans=0;
            int p=0;
            int d=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int diff=a-d;
                if(diff % 2 == Math.abs(b-p))ans+=diff;
                else ans+=diff-1;
                d=a;
                p=b;
            }
            System.out.println(ans+m-d);
        }
    }
}
