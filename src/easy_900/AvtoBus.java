package easy_900;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long a=n/12;
            long f=n%12;
            long b=0;
            if(f==6||f==4)b=1;
            else if(f==8||f==10)b=2;
            else if(f==2 && n>12) {
                System.out.println(a*2+1+" "+(a*3));continue;
            }
            else if(f!=0 ){
                System.out.println(-1);continue;
            }
            System.out.println(a*2+b+" "+(a*3+b));
        }
    }
}
