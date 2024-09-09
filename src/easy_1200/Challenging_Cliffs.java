package easy_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Challenging_Cliffs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int h[]=new int[n];
            for (int i=0;i<n;i++)h[i]=sc.nextInt();
            Arrays.sort(h);
            if(n==2){
                System.out.println(h[0]+" "+h[1]);
                continue;
            }
            int d=Integer.MAX_VALUE;
            int in1=-1,in2=-1;
            for (int i=0;i<n-1;i++){
                int diff=h[i+1]-h[i];
                if(diff<d){
                    d=diff;
                    in1=i;
                    in2=i+1;
                }
            }
            for (int i=in2;i<n;i++) System.out.print(h[i]+" ");
            for (int i=0;i<=in1;i++) System.out.print(h[i]+" ");
            System.out.println();
        }
    }

}
