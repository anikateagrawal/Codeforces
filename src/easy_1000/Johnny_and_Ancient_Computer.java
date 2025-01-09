package easy_1000;

import java.util.Scanner;

public class Johnny_and_Ancient_Computer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long min=Math.min(a,b);
            long max=Math.max(a,b);
            int c=0;
            while (min<max){
                c++;
                if(min*8<=max){
                    min*=8;
                }
                else if(min*4<=max){
                    min*=4;
                }
                else min*=2;
            }
            if(min==max) System.out.println(c);
            else System.out.println(-1);
        }
    }
}
