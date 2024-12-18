package easy_900;

import java.util.Scanner;

public class Odd_Grasshopper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long n=sc.nextLong();
            long r=n%4;
            long d=n/4;
            if(x%2==0){
                if(r==0) System.out.println(x);
                else if(r==2) System.out.println(x+1);
                else if(r==1) System.out.println((x-1-4*d));
                else System.out.println(x+4*(d+1));
            }
            else{
                if(r==0) System.out.println(x);
                else if(r==2) System.out.println(x-1);
                else if(r==1) System.out.println((x+1+4*d));
                else System.out.println(x-4*(d+1));
            }
        }
    }
}
