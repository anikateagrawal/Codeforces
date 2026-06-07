package easy_800;

import java.util.Arrays;
import java.util.Scanner;

public class Flip_Flops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long c=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            for (int i:a){
                if (i<=c){
                    long d=Math.min(c-i,k);
                    k-=d;
                    c+=i+d;
                }
                else break;
            }
            System.out.println(c);
        }
    }
}
