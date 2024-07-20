package easy_900;

import java.util.Scanner;

public class Tricky_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long p2=0;
            int p=0;
            while(Math.pow(2,p)<=n){
                p2+=Math.pow(2,p);
                p++;
            }
            long ans=1L*n*(n+1)/2-2*p2;
            System.out.println(ans);
        }
    }
}
