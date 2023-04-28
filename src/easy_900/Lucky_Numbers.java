package easy_900;

import java.util.Scanner;

public class Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int d=0;
            int num=l;
            for(int i=l;i<=r;i++){
                int df=diff(i);
                if(df>d){
                    d=df;
                    num=i;
                }
                if(d==9){
                    System.out.println(num);
                    continue outer;
                }
            }
            System.out.println(num);
        }
    }
    static int diff(int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n>0){
            int d=n%10;
            if(d>max)max=d;
            if(d<min)min=d;
            n/=10;
        }
        return max-min;
    }
}
