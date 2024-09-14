package easy_1100;

import java.util.Scanner;

public class Effective_Approach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int in[]=new int[n];
        for (int i=0;i<n;i++)in[sc.nextInt()-1]=i;
        int m=sc.nextInt();
        long a=0,b=0;
        while (m-->0){
            int q=sc.nextInt();
            int x=in[q-1];
            int y=n-x;
            a+=x+1;
            b+=y;
        }
        System.out.println(a+" "+b);
    }
}
