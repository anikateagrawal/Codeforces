package easy_1000;

import java.util.Scanner;

public class MEXor_Mixup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=a-1;
            int x=0;
            if(n%4==0)x=n;
            else if(n%4==1)x=1;
            else if (n%4==2)x=n+1;
            if((b^x)==a) System.out.println(a+2);
            else if (x==b) System.out.println(a);
            else System.out.println(a+1);
        }
    }
}
