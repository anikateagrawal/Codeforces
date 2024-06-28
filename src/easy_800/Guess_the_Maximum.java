package easy_800;

import java.util.Scanner;

public class Guess_the_Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)a[i]=sc.nextInt();
            int k=Integer.MAX_VALUE;
            for (int i=0;i<n-1;i++){
                k=Math.min(k,Math.max(a[i],a[i+1])-1);
            }
            System.out.println(k);
        }
    }
}
