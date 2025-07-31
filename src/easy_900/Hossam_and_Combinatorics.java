package easy_900;

import java.util.Scanner;

public class Hossam_and_Combinatorics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                min=Math.min(min,a[i]);
                max=Math.max(max,a[i]);
            }
            long minc=0,maxc=0;
            for (int i:a){
                if(i==min)minc++;
                if(i==max)maxc++;
            }
            if(min!=max){
                maxc*=minc;
                System.out.println(maxc*2);
            }
            else {
                System.out.println(maxc*(maxc-1));
            }

        }
    }
}
