package easy_1200;

import java.util.Scanner;

public class Sequence_with_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long k=sc.nextLong();
            for (int i=1;i<k;i++){
                long max=0,min=10;
                long n=a;
                while (n>0){
                    long d=n%10;
                    max=Math.max(d,max);
                    min=Math.min(d,min);
                    n/=10;
                }
                if(min==0)break;
                a=a+min*max;
            }
            System.out.println(a);
        }
    }
}
