package easy_800;

import java.util.Scanner;

public class Find_Minimum_Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int op=0;
            if(k==1) {
                System.out.println(n);continue;
            }
            while (n>0){
                op+=n%k;
                n/=k;
            }
            System.out.println(op);
        }
    }
}
