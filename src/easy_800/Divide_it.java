package easy_800;

import java.util.Scanner;

public class Divide_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            int op=0;
            boolean flag=true;
            while (n>1){
                if(n%2==0){
                    n/=2;
                    op++;
                }
                else if(n%3==0){
                    n=2*n/3;
                    op++;
                }
                else if(n%5==0){
                    n=4*n/5;
                    op++;
                }
                else {
                    flag=false;break;
                }
            }
            if (!flag) System.out.println(-1);
            else
            System.out.println(op);
        }
    }
}
