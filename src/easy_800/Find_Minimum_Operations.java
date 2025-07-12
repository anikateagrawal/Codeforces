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
            while (n>0){
                int p=(int)(Math.log(n)/Math.log(k));
                op++;
                n-=Math.pow(k,p);
            }
            System.out.println(op);

        }
    }
}
