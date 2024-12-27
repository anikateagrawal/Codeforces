package easy_1000;

import java.util.Scanner;

public class Balanced_Remainders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c[]=new int[3];
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                c[a%3]++;
            }
            int m=0;
            for (int i=0;i<6;i++){
                int in=i%3;
                if(c[in]>n/3){
                    int d=c[in]-n/3;
                    int p=(in+1)%3;
                    c[in]=n/3;
                    c[p]+=d;
                    m+=d;
                }
            }
            System.out.println(m);
        }
    }
}
