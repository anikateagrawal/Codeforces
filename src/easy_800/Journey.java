package easy_800;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int s=a+b+c;
            int d=n/s*3;
            n%=s;
            if(n>0)d++;
            if (n>a)d++;
            n-=a;
            if(n>b)d++;
            System.out.println(d);
        }
    }
}
